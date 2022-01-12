public static void main(java.lang.String[] args) throws java.lang.Exception {
    try {
        org.neo4j.wrapper.LoggingService.initLogger();
    } catch (java.lang.Exception e) {
        org.neo4j.wrapper.NeoServiceWrapper.LOGGER.log(java.util.logging.Level.SEVERE, e.toString(), e);
    }
    if ((args.length) == 1) {
        org.neo4j.wrapper.NeoServiceWrapper.launchAsService(args[0]);
    }else {
        org.neo4j.wrapper.NeoServiceWrapper.launchAsConsoleApp();
    }
}