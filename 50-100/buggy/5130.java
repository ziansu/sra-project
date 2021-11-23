protected void registerFuture(org.apache.tomcat.websocket.FutureToSendHandler f2sh) {
    boolean fail = false;
    synchronized(stateLock) {
        if ((state) == (org.apache.tomcat.websocket.WsSession.State.OPEN)) {
            futures.put(f2sh, f2sh);
        }else
            if (f2sh.isDone()) {
            }else {
                fail = true;
            }
        
    }
    if (fail) {
        java.io.IOException ioe = new java.io.IOException(org.apache.tomcat.websocket.WsSession.sm.getString("wsSession.messageFailed"));
        javax.websocket.SendResult sr = new javax.websocket.SendResult(ioe);
        f2sh.onResult(sr);
    }
}