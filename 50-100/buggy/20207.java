private java.lang.String checkForException(java.nio.file.Path sourcePath, java.util.ArrayList<FileExtractor.Settings.ExceptionPath> exceptions) {
    for (FileExtractor.Settings.ExceptionPath exceptionPath : exceptions) {
        if (sourcePath.toString().contains(exceptionPath.getName())) {
            return exceptionPath.getPath();
        }
    }
    return "";
}