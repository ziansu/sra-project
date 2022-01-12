private static MiniWebStore deserializeStore(java.lang.String filename) throws java.io.IOException, java.lang.ClassNotFoundException {
    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(filename);
    java.util.zip.GZIPInputStream gzipInputStream = new java.util.zip.GZIPInputStream(fileInputStream);
    java.io.ObjectInputStream objectInputStream = new java.io.ObjectInputStream(gzipInputStream);
    MiniWebStore loadedStore = ((MiniWebStore) (objectInputStream.readObject()));
    objectInputStream.close();
    return loadedStore;
}