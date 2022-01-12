private void delFileList(java.io.File[] fileList, long timemark) {
    for (java.io.File aFile : fileList) {
        if (aFile.isFile()) {
            filename = aFile.getName();
            if ((aFile.lastModified()) < timemark) {
                aFile.delete();
            }
        }
    }
}