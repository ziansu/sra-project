java.lang.String[] fileList(final java.io.File folder) {
    for (final java.io.File fileEntry : folder.listFiles()) {
        if (fileEntry.isDirectory()) {
            fileList(fileEntry);
        }else {
            (i)++;
            fileNames[i] = fileEntry.getName();
        }
    }
    return fileNames;
}