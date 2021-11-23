public void Listener() throws java.lang.Exception {
    com.sun.net.httpserver.HttpServer server = com.sun.net.httpserver.HttpServer.create(new java.net.InetSocketAddress(8443), 0);
    server.createContext("/v0.1/rss/", new RSSHandler(this.conn));
    server.setExecutor(null);
    server.start();
}