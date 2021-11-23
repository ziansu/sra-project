@java.lang.Override
public void close() throws java.io.IOException {
    if ((id) != null) {
        execute.close(id);
    }
}