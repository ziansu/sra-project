@java.lang.Override
public java.io.OutputStream getOutput() throws java.io.IOException {
    return fs.create(path);
}