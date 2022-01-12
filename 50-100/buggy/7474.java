@org.junit.Test(expected = org.corpus_tools.salt.exceptions.SaltResourceException.class)
public void testAbsentSaltResource() throws java.io.IOException {
    java.lang.String inputFilePath = ((((((org.corpus_tools.salt.util.tests.VisJsVisualizerTest.INPUT_FOLDER) + (org.corpus_tools.salt.util.tests.VisJsVisualizerTest.FSEP)) + "pcc2_absent_resource") + (org.corpus_tools.salt.util.tests.VisJsVisualizerTest.FSEP)) + "pcc2") + (org.corpus_tools.salt.util.tests.VisJsVisualizerTest.FSEP)) + "11299.salt";
    org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createFileURI(inputFilePath);
    @java.lang.SuppressWarnings(value = "unused")
    org.corpus_tools.salt.util.VisJsVisualizer visJsVisualizer = new org.corpus_tools.salt.util.VisJsVisualizer(uri);
}