protected final java.io.InputStream newInputStreamRemote(char[] path) throws java.io.IOException {
    if (exists(path)) {
        try {
            return getDelegate().newInputStream(path);
        } catch (java.io.FileNotFoundException ex) {
        }
    }
    if ((pathSynchronizer) == null) {
        retriever.retrieve(path);
    }else {
        pathSynchronizer.execute(path, () -> {
            retriever.retrieve(path);
            return null;
        });
    }
    return getDelegate().newInputStream(path);
}