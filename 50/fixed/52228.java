@org.junit.After
public void tearDown() throws java.lang.Exception {
    gate.python.Factory.deleteResource(pythonPR);
    gate.python.Factory.deleteResource(controller);
    gate.python.Factory.deleteResource(corpus);
    gate.python.Factory.deleteResource(document);
    corpus = null;
    document = null;
}