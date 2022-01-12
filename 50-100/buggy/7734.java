protected void closeFileObject(com.shesse.h2ha.FilePathHa filePath, long lastModified) throws java.io.IOException {
    java.nio.channels.FileChannel fc = openFiles.remove(filePath);
    if (fc != null) {
        fc.close();
    }
    if (filePath.exists()) {
        filePath.lastModified(lastModified);
    }
}