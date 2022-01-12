private boolean receiveRequest(java.nio.channels.SelectionKey key, org.xtreemfs.foundation.pbrpc.server.RPCServerRequest request, org.xtreemfs.foundation.pbrpc.server.RPCNIOSocketServerConnection con) {
    try {
        request.getHeader();
        receiver.receiveRecord(request);
        return true;
    } catch (java.lang.IllegalArgumentException ex) {
        org.xtreemfs.foundation.logging.Logging.logMessage(Logging.LEVEL_ERROR, Category.net, this, ("invalid PBRPC header received: " + ex));
        if (org.xtreemfs.foundation.logging.Logging.isDebug()) {
            org.xtreemfs.foundation.logging.Logging.logError(Logging.LEVEL_DEBUG, this, ex);
        }
        return false;
    }
}