public void close() throws java.io.IOException {
    file.getChannel().force(true);
    file.close();
}