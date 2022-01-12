private static void walkSrcFolderAndCountLocFromFiles(java.io.File[] files, java.lang.String tag) {
    for (java.io.File file : files) {
        if (file.isDirectory()) {
            net.sf.memoranda.util.LocCounter.walkSrcFolderAndCountLocFromFiles(file.listFiles(), tag);
        }else {
            net.sf.memoranda.util.LocCounter.countLocFromFile(file, tag);
        }
    }
}