public void addRemovedUrl(java.lang.String url) throws java.io.IOException {
    synchronized(removedSet) {
        removedSet.add(url);
    }
    synchronized(removedFile) {
        java.io.RandomAccessFile raf = new java.io.RandomAccessFile(removedFile, "rw");
        raf.seek(raf.length());
        raf.write(url.getBytes());
        raf.close();
    }
}