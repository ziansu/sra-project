public void stop() {
    if ((server) != null) {
        try {
            server.stop();
        } catch (java.lang.Exception e) {
            com.jbm.ws.JettyWebsocketServer.log.error("cannot stop websocket server", e);
        }
    }
}