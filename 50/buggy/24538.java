private void deleteDirs() {
    if (!(deleteAtEnd)) {
        return ;
    }
    for (java.lang.String subDir : subDirs) {
        org.apache.commons.io.FileUtils.deleteQuietly(new java.io.File(baseDir, subDir));
    }
}