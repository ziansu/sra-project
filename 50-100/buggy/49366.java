private void findAllFilesInCurrentDirectory(java.lang.String path) {
    java.util.ArrayList<java.io.File> allFindedFiles = findAllFilesInCurrentDir(path);
    for (java.io.File file : allFindedFiles) {
        if ((isDeepSearch) && (file.isDirectory())) {
            findAllFilesInCurrentDirectory(file.getAbsolutePath());
        }else {
            if (isValidExtension(file)) {
                if (isOlderThanDeleteDate(file)) {
                    result.add(file);
                }
            }
        }
    }
}