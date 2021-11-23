public org.zlambda.projects.emjetty.core.EmbeddedServletContainer start() throws java.lang.Exception {
    server.start();
    server.join();
    return this;
}