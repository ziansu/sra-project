private void free() {
    definitions.clear();
    inputOperations.clear();
    locksMap.clear();
    initExecutionThread = null;
    sessionStarters = new java.util.HashMap<java.lang.String, jolie.Interpreter.SessionStarter>();
    outputPorts.clear();
    correlationSets.clear();
    globalValue.erase();
    embeddedServiceLoaders.clear();
    classLoader = null;
    commCore = null;
    java.lang.System.gc();
}