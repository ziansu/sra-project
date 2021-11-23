public static void main(java.lang.String[] args) throws java.lang.Exception {
    final org.glassfish.grizzly.http.server.HttpServer server = org.glassfish.grizzly.http.server.HttpServer.createSimpleServer("html", 80);
    com.fonyli.tonyliweb.functions.markovchain.MarkovChain.getInstance().selectTeacher(MarkovChain.SHAKESPEARE);
    com.fonyli.tonyliweb.server.MainService.addHttpHandlers(server);
    com.fonyli.tonyliweb.server.MainService.start(server);
}