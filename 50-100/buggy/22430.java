public boolean checkFirstPendingRoleRequestXid(net.floodlightcontroller.core.IOFSwitch sw, int xid) {
    java.util.LinkedList<net.floodlightcontroller.core.internal.RoleChanger.PendingRoleRequestEntry> pendingRoleRequests = pendingRequestMap.get(sw);
    if (pendingRoleRequests == null) {
        return false;
    }
    synchronized(pendingRoleRequests) {
        net.floodlightcontroller.core.internal.RoleChanger.PendingRoleRequestEntry head = pendingRoleRequests.peek();
        if (head == null)
            return false;
        else
            return (head.xid) == xid;
        
    }
}