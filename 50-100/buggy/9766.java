private void roamDirectory(java.io.File directory) {
    java.io.File[] fileList = directory.listFiles(interestingFilesFilter);
    for (java.io.File file : fileList) {
        searchListener.onInterestingFileFound(file);
        addChecked(file);
    }
    java.io.File[] dirs = directory.listFiles(directoryFileFilter);
    for (java.io.File dir : dirs) {
        roamDirectory(dir);
    }
}