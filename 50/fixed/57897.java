@java.lang.Override
public void close() throws java.io.IOException {
    if (_canClose) {
        in.close();
    }
}