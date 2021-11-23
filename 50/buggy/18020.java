@java.lang.Override
public void close() throws java.io.IOException {
    steps.clear();
    steps = null;
    processor = null;
    uriResolver = null;
}