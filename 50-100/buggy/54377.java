protected com.martiansoftware.jsap.JSAPResult parseParameters(java.lang.String[] args) throws java.lang.Exception {
    com.martiansoftware.jsap.SimpleJSAP jsap = buildCommandLineOptions();
    com.martiansoftware.jsap.JSAPResult config = jsap.parse(args);
    if ((!(config.success())) || (jsap.messagePrinted())) {
        java.util.Iterator<?> messageIterator = config.getErrorMessageIterator();
        while (messageIterator.hasNext())
            java.lang.System.err.println(messageIterator.next());
        
        java.lang.System.err.println(jsap.getHelp());
        return null;
    }
    return config;
}