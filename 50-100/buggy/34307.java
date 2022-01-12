java.util.Collection<org.aksw.rdfunit.tests.results.TestCaseResult> runTest(org.aksw.rdfunit.junit.RdfUnitJunitTestCase rdfUnitJunitTestCase) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
    final org.aksw.rdfunit.sources.TestSource modelSource = new org.aksw.rdfunit.sources.TestSourceBuilder().setPrefixUri("custom", "rdfunit").setInMemReader(new org.aksw.rdfunit.io.reader.RDFModelReader(rdfUnitJunitTestCase.getInputModel())).setReferenceSchemata(rdfUnitJunitTestCase.getSchemaSource()).build();
    try {
        return this.executeSingleTest(modelSource, rdfUnitJunitTestCase.getTestCase());
    } catch (org.aksw.rdfunit.exceptions.TestCaseExecutionException e) {
        throw new java.lang.RuntimeException(e);
    }
}