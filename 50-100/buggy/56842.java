private static int walkSrcFolderAndCountLocFromFiles(java.io.File[] files, java.lang.String tag, int linesOfCode) {
    int tmpLinesOfCode = linesOfCode;
    for (java.io.File file : files) {
        if (file.isDirectory()) {
            tmpLinesOfCode += net.sf.memoranda.util.LocCounter.walkSrcFolderAndCountLocFromFiles(file.listFiles(), tag, tmpLinesOfCode);
        }else {
            tmpLinesOfCode += net.sf.memoranda.util.LocCounter.countLocFromFile(file, tag);
        }
    }
    return tmpLinesOfCode;
}