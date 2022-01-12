public static void main(java.lang.String[] args) throws java.lang.Exception {
    final org.glassfish.grizzly.http.server.HttpServer server = org.glassfish.grizzly.http.server.HttpServer.createSimpleServer("html", 80);
    com.fonyli.tonyliweb.functions.markovchain.MarkovChain.getInstance().selectTeacher(MarkovChain.SHAKESPEARE);
    com.fonyli.tonyliweb.server.MainService.addHttpHandlers(server);
    org.glassfish.grizzly.http.server.StaticHttpHandler staticHttpHandler = new org.glassfish.grizzly.http.server.StaticHttpHandler("html");
    server.getServerConfiguration().addHttpHandler(staticHttpHandler, "/fdsfdsfds/");
    com.fonyli.tonyliweb.server.MainService.start(server);
}