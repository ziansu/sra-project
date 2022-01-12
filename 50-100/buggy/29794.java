private long countAllSizeRec(java.io.File dir) {
    java.lang.Long size = 0L;
    final java.lang.String[] list = dir.list();
    for (java.lang.String file : list) {
        final java.io.File fFile = new java.io.File(dir, file);
        if (fFile.isDirectory()) {
            size += countAllSizeRec(fFile);
        }else {
            size += fFile.length();
        }
    }
    return size;
}