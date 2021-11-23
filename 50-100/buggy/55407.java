protected void initServer() {
    try {
        if ((org.exist.xmldb.RemoteDBTest.server) == null) {
            org.exist.xmldb.RemoteDBTest.server = new org.exist.jetty.JettyStart();
            if (!(org.exist.xmldb.RemoteDBTest.server.isStarted())) {
                org.exist.xmldb.RemoteDBTest.server.run();
            }
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        fail(e.getMessage());
    }
}