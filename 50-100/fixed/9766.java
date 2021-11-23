private void roamDirectory(java.io.File directory) {
    java.io.File[] fileList = directory.listFiles(interestingFilesFilter);
    if (fileList != null) {
        for (java.io.File file : fileList) {
            searchListener.onInterestingFileFound(file);
            addChecked(file);
        }
    }
    java.io.File[] dirs = directory.listFiles(directoryFileFilter);
    if (dirs != null) {
        for (java.io.File dir : dirs) {
            roamDirectory(dir);
        }
    }
}