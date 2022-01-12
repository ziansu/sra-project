@java.lang.Override
public void keepAlive(long leaseId) {
    synchronized(lock) {
        if (!(keepAlives.containsKey(leaseId))) {
            com.coreos.jetcd.lease.Lease lease = new com.coreos.jetcd.lease.Lease(leaseId);
            lease.setNextKeepAlive(java.lang.System.currentTimeMillis());
            lease.setDeadLine(((java.lang.System.currentTimeMillis()) + (firstKeepAliveTimeOut)));
            keepAlives.put(leaseId, lease);
        }
    }
    return ;
}