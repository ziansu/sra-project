private void deleteFiles(java.lang.String folder) {
    java.util.List<java.lang.String> filePathList = getFilePath(folder);
    if (filePathList != null) {
        for (java.lang.String filePath : filePathList) {
            java.io.File file = new java.io.File(filePath);
            if (file.exists()) {
                file.delete();
            }
        }
    }
}