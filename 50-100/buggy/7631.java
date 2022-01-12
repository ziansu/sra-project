public java.io.InputStream getInput(java.lang.String pathname) throws java.io.FileNotFoundException {
    org.infinispan.io.GridFile file = ((org.infinispan.io.GridFile) (getFile(pathname)));
    if (!(file.exists()))
        throw new java.io.FileNotFoundException(pathname);
    
    if (file.isDirectory()) {
        throw new java.io.FileNotFoundException((("Cannot read from directory (" + file) + ")"));
    }
    return new org.infinispan.io.GridInputStream(file, data, default_chunk_size);
}