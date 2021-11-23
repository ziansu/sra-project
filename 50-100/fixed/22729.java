private void delFileList(java.io.File[] fileList, long timemark) {
    for (java.io.File aFile : fileList) {
        if (aFile.isFile()) {
            if ((aFile.lastModified()) < timemark) {
                aFile.delete();
            }
        }
    }
}