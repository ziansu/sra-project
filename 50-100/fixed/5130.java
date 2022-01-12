protected void registerFuture(org.apache.tomcat.websocket.FutureToSendHandler f2sh) {
    futures.put(f2sh, f2sh);
    if ((state) == (org.apache.tomcat.websocket.WsSession.State.OPEN)) {
        return ;
    }
    if (f2sh.isDone()) {
        return ;
    }
    java.io.IOException ioe = new java.io.IOException(org.apache.tomcat.websocket.WsSession.sm.getString("wsSession.messageFailed"));
    javax.websocket.SendResult sr = new javax.websocket.SendResult(ioe);
    f2sh.onResult(sr);
}