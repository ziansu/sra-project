protected org.payn.chsm.io.reporters.ReporterFactoryXML<?> getReporterFactory(org.payn.chsm.io.xmltools.ElementReporter outputElem) throws java.lang.Exception {
    java.lang.String classPath = outputElem.getClassPath();
    if (!(classPath.equals(""))) {
        return ((org.payn.chsm.io.reporters.ReporterFactoryXML<?>) (createObjectInstance(outputElem.getFile(pathRoot), classPath, java.lang.String.format("Reporter factory %s", classPath))));
    }else {
        return null;
    }
}