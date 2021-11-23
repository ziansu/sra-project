@java.lang.Override
public void tearDown() throws java.lang.Exception {
    if ((ncprocess) != null) {
        ncprocess.close();
    }
    if ((config) != null) {
        config.shutDown();
    }
}