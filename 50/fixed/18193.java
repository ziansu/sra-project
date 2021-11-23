public void close() throws java.io.IOException {
    writer.commitAndClose();
    writer = null;
    writeBuffer = null;
}