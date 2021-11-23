public void onClientDisconnected(java.lang.String identifier) throws java.lang.InterruptedException {
    connectionSemaphore.acquire();
    it.polimi.spf.wfd.WfdLog.d(it.polimi.spf.wfd.GroupOwnerActor.TAG, ("Client lost id : " + identifier));
    it.polimi.spf.wfd.GOInternalClient c = gOInternalClients.remove(identifier);
    if (c != null) {
        signalInstanceLossToGroup(identifier);
    }
    connectionSemaphore.release();
    if (c != null) {
        c.recycle();
    }
}