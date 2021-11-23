private void parseParams(com.beust.jcommander.JCommander jc, java.lang.String[] args) {
    try {
        jc.parse(args);
    } catch (java.lang.Exception e) {
        com.containersol.minimesos.main.Main.LOGGER.error((("Failed to parse parameters. " + (e.getMessage())) + "\n"));
        printUsage(null);
        throw e;
    }
}