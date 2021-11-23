public static void main(java.lang.String[] args) throws java.io.IOException, java.net.URISyntaxException, java.security.KeyManagementException, java.security.NoSuchAlgorithmException {
    Spring.context.getBean(com.mcm.MainThread.class).run();
    new com.mcm.network.NetworkManager().initializeServer(com.mcm.Main.port);
}