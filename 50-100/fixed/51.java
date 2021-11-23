@com.sb.elsinore.annotations.UrlEndpoint(url = "/shutdownSystem", help = "Shutdown Elsinore or turn off the system", parameters = { @com.sb.elsinore.annotations.Parameter(name = "turnoff", value = "true: turn off the entire system, false: shutdown Elsinore only") })
public com.sb.elsinore.NanoHTTPD.Response shutdownSystem() {
    try {
        com.sb.elsinore.LaunchControl.saveEverything();
        boolean shutdownEverything = java.lang.Boolean.parseBoolean(parameters.get("turnoff"));
        if (shutdownEverything) {
            java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
            runtime.exec("shutdown -h now");
        }
        java.lang.System.exit(0);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        BrewServer.LOG.warning(("Failed to shutdown. " + (e.getMessage())));
    }
    return new com.sb.elsinore.NanoHTTPD.Response("Shutdown called");
}