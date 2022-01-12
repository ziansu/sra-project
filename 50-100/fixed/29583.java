public void stop() {
    org.apache.zeppelin.server.SmartZeppelinServer.LOG.info("Shutting down Zeppelin Server ... ");
    try {
        if ((jettyWebServer) != null) {
            jettyWebServer.stop();
        }
        if ((notebook) != null) {
            notebook.getInterpreterSettingManager().shutdown();
            notebook.close();
        }
        java.lang.Thread.sleep(1000);
    } catch (java.lang.Exception e) {
        org.apache.zeppelin.server.SmartZeppelinServer.LOG.error("Error while stopping servlet container", e);
    }
    org.apache.zeppelin.server.SmartZeppelinServer.LOG.info("Bye");
}