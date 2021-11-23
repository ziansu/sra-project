protected java.lang.String normalizeFileName(java.lang.String fileName) {
    java.lang.String newFileName = fileName;
    newFileName = newFileName.replaceAll("\\.(?=.*\\.)", "_");
    newFileName = newFileName.replaceAll("[^a-zA-Z0-9-.]", "_");
    if ((newFileName.length()) > 90) {
        newFileName = ((newFileName.substring(0, 43)) + "___") + (newFileName.substring(((newFileName.length()) - 43)));
    }
    return newFileName;
}