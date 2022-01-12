private static boolean haveLock(java.lang.String res) {
    java.util.Queue<zolera.dist.LockManager.LockRequest> queue = zolera.dist.LockManager.resources.get(res);
    if (queue == null)
        return false;
    
    zolera.dist.LockManager.LockRequest head = queue.peek();
    if (head == null)
        return false;
    
    if ((head.requester.equals(zolera.dist.CommunicationsManager.getName())) && ((head.acknowledges) >= (zolera.dist.CommunicationsManager.receiversCount())))
        return true;
    else
        return false;
    
}