@java.lang.Override
public void close() throws java.io.IOException {
    if (_canClose) {
        this.in.close();
    }
}