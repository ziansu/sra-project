private java.lang.String checkForException(java.lang.String fileName, java.util.ArrayList<FileExtractor.Settings.ExceptionPath> exceptions) {
    for (FileExtractor.Settings.ExceptionPath exceptionPath : exceptions) {
        if (fileName.toLowerCase().startsWith(exceptionPath.getName().toLowerCase())) {
            return exceptionPath.getPath();
        }
    }
    return "";
}