public org.seekay.contract.server.ContractServer startServer() {
    tomcat.setPort(this.port);
    tomcat.setBaseDir("target/tomcat/");
    configureServer();
    try {
        tomcat.start();
        waitForServerToStart();
    } catch (org.apache.catalina.LifecycleException e) {
        throw new java.lang.IllegalStateException("Problem occurred starting tomcat", e);
    }
    log.info(("Tomcat server started on port " + (this.port)));
    pushContractsToServer();
    return this;
}