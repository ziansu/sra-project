private void initializePipeline(final java.lang.String xmlParamsFile, final java.lang.String threadNumber, final java.lang.String advanceToProgram) throws java.io.IOException, java.lang.IllegalArgumentException, javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXException {
    resolver = new org.sing_group.compi.xmlio.XMLParamsFileVariableResolver(xmlParamsFile);
    initializeExecutorService(threadNumber);
    programManager.checkDependsOnIds();
    org.sing_group.compi.xmlio.PipelineParser.solveExec(pipeline.getPrograms());
    programManager.initializeDependencies();
    skipPrograms(advanceToProgram);
}