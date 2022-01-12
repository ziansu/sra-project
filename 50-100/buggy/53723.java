@java.lang.Override
protected void loadLoggers() throws java.lang.Exception {
    java.util.Iterator<org.payn.chsm.io.xmltools.ElementLogger> loggerIter = documentConfig.getLoggerIterator();
    if (loggerIter != null) {
        loggerList.clear();
        while (loggerIter.hasNext()) {
            org.payn.chsm.io.xmltools.ElementLogger loggerElem = loggerIter.next();
            java.io.File loggerFile = loggerElem.getFile(pathRoot);
            java.lang.String classPath = loggerElem.getClassPath();
            loggerList.add(org.payn.chsm.io.ModelLoader.loadClass(getClass().getClassLoader(), loggerFile, classPath));
        } 
    }
}