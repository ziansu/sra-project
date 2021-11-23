void serve() throws java.io.IOException {
    java.net.InetSocketAddress address = new java.net.InetSocketAddress(port);
    com.sun.net.httpserver.HttpServer server = com.sun.net.httpserver.HttpServer.create(address, 0);
    server.createContext("/search", new service.ServerGeneric.QueryHandlerSearch());
    server.createContext("/pull", new service.ServerGeneric.QueryHandlerPull());
    server.setExecutor(java.util.concurrent.Executors.newCachedThreadPool());
    server.start();
}