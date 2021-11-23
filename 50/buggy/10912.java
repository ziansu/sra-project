public com.sun.net.httpserver.HttpServer createHttpServer(milestone1.Node n) throws java.io.IOException {
    org.glassfish.jersey.server.ResourceConfig resourceConfig = new org.glassfish.jersey.server.ResourceConfig(milestone1.NodeAPI.class);
    resourceConfig.register(n);
    return org.glassfish.jersey.jdkhttp.JdkHttpServerFactory.createHttpServer(getURI(), resourceConfig);
}