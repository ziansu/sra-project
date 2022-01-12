public java.io.OutputStream getOutput(org.infinispan.io.GridFile file) throws java.io.IOException {
    if (file.isDirectory()) {
        throw new java.io.FileNotFoundException((("Cannot write to directory (" + file) + ")"));
    }
    if (!(file.createNewFile()))
        throw new java.io.IOException((("creation of " + file) + " failed"));
    
    return new org.infinispan.io.GridOutputStream(file, false, data, default_chunk_size);
}