public void deduplicate(java.lang.String digestsPath, java.lang.String rootDirPath) throws java.io.FileNotFoundException, java.io.IOException {
    digests = new java.io.RandomAccessFile(digestsPath, "r");
    java.io.File rootDir = new java.io.File(rootDirPath);
    findAllWarcsRecursively(rootDir);
    for (java.lang.String warc : warcFiles) {
        currentWarc = warc;
        writeWarcDedup(warc);
    }
}