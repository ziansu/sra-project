protected static org.glassfish.grizzly.http.server.HttpServer startServer() throws java.io.IOException {
    final org.glassfish.jersey.server.ResourceConfig rc = new org.glassfish.jersey.server.ResourceConfig().packages("org.wikibrain.atlasify");
    rc.register(org.wikibrain.atlasify.CORSFilter.class);
    rc.register(org.glassfish.jersey.jackson.JacksonFeature.class);
    java.lang.System.out.println("Staring grizzly...");
    org.glassfish.grizzly.http.server.HttpServer server = org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory.createHttpServer(org.wikibrain.atlasify.AtlasifyServer.baseURI, rc);
    return server;
}