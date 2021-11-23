private void writeMetadata(java.util.Map<java.lang.String, ? extends java.io.Serializable> metadata, com.jakewharton.disklrucache.DiskLruCache.Editor editor) throws java.io.IOException {
    java.io.ObjectOutputStream oos = null;
    try {
        oos = new java.io.ObjectOutputStream(new java.io.BufferedOutputStream(editor.newOutputStream(com.anupcowkur.reservoir.SimpleDiskCache.METADATA_IDX)));
        oos.writeObject(metadata);
    } finally {
        closeQuietly(oos);
    }
}