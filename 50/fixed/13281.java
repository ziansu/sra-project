@org.junit.Test(expected = org.corpus_tools.salt.exceptions.SaltParameterException.class)
public void testInputUrlIsNull() throws java.io.IOException {
    org.eclipse.emf.common.util.URI uri = null;
    new org.corpus_tools.salt.util.VisJsVisualizer(uri);
}