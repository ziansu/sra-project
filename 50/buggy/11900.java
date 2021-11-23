@java.lang.Override
public void close() throws java.io.IOException {
    currentBuffer = null;
    buffers.clear();
    markers.clear();
}