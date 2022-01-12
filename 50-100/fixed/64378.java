private static java.lang.String getFileExtension(@javax.validation.constraints.NotNull
java.io.File file) {
    java.lang.String fileName = file.getName();
    int i = fileName.lastIndexOf('.');
    if (i > 0) {
        return fileName.substring((i + 1));
    }
    return "";
}