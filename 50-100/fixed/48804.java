public static void main(java.lang.String[] args) {
    try {
        com.sun.net.httpserver.HttpServer server = com.sun.net.httpserver.HttpServer.create(new java.net.InetSocketAddress("192.168.128.90", 4500), 30);
        server.createContext("/lamp/", new CustomHttpHandler(CustomKaaClient.getKaaClient(), null));
        server.start();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}