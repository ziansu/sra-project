protected final java.io.InputStream newInputStreamRemote(char[] path) throws java.io.IOException {
    if (exists(path)) {
        try {
            return getDelegate().newInputStream(path);
        } catch (java.io.FileNotFoundException ex) {
        }
    }
    retrieve(path);
    return getDelegate().newInputStream(path);
}