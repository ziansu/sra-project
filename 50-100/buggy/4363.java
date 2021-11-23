public java.io.File sortFile(java.io.File inFile, java.util.Comparator<java.lang.String> lineComparator) throws java.io.IOException {
    java.io.File out = null;
    try {
        com.jamesanton.cruncher.util.FileUtil.removeFilesAndFolder(com.jamesanton.cruncher.data.FileSorter.BROKEN_UP_PATH, com.jamesanton.cruncher.data.FileSorter.SORTED_PATH, com.jamesanton.cruncher.data.FileSorter.OUT_FILE);
        breakUpFile(inFile, com.jamesanton.cruncher.data.FileSorter.BROKEN_UP_PATH);
        sortSmallFiles(com.jamesanton.cruncher.data.FileSorter.BROKEN_UP_PATH, com.jamesanton.cruncher.data.FileSorter.SORTED_PATH, lineComparator);
        out = mergeSortedFiles(com.jamesanton.cruncher.data.FileSorter.SORTED_PATH, com.jamesanton.cruncher.data.FileSorter.OUT_FILE, lineComparator);
        com.jamesanton.cruncher.util.FileUtil.removeFilesAndFolder(com.jamesanton.cruncher.data.FileSorter.BROKEN_UP_PATH, com.jamesanton.cruncher.data.FileSorter.SORTED_PATH);
    } catch (java.io.IOException e) {
        com.jamesanton.cruncher.data.FileSorter.LOG.error("There was a problem sorting your file...", e);
    }
    return out;
}