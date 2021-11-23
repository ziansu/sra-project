public java.io.OutputStream getOutput(java.lang.String pathname, boolean append, int chunk_size) throws java.io.IOException {
    org.infinispan.io.GridFile file = ((org.infinispan.io.GridFile) (getFile(pathname, chunk_size)));
    if (file.isDirectory()) {
        throw new java.io.FileNotFoundException((("Cannot write to directory (" + pathname) + ")"));
    }
    if (!(file.createNewFile()))
        throw new java.io.IOException((("creation of " + pathname) + " failed"));
    
    return new org.infinispan.io.GridOutputStream(file, append, data, chunk_size);
}