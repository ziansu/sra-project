public static void main(java.lang.String[] args) throws java.lang.Exception {
    org.glassfish.tyrus.server.Server server = new org.glassfish.tyrus.server.Server("0.0.0.0", 80, "/", null, async.MyApplicationConfig.class);
    try {
        server.start();
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.System.in));
        while (true) {
        } 
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    } finally {
        server.stop();
    }
}