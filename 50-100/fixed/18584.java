public boolean isLeaseStillValid(int leaseId) {
    if (leaseId == 0) {
        return false;
    }
    de.fau.cs.mad.kwikshop.common.SynchronizationLease lease;
    try {
        lease = leaseDAO.getLease(leaseId);
    } catch (de.fau.cs.mad.kwikshop.server.exceptions.LeaseNotFoundException e) {
        return false;
    }
    long expirationTime = lease.getExpirationTime().getTime();
    long now = new java.util.Date().getTime();
    boolean valid = now < expirationTime;
    if (!valid) {
        leaseDAO.deleteLease(lease);
    }
    return valid;
}