private static app.util.HttpUtils.ContentType getContentType(java.lang.String fileName) {
    int lastDotPosition = fileName.lastIndexOf(".");
    java.lang.String fileExtension;
    if (lastDotPosition != (-1)) {
        fileExtension = fileName.substring((lastDotPosition + 1));
    }else {
        fileExtension = fileName;
    }
    fileExtension = fileExtension.toLowerCase();
    app.util.HttpUtils.ContentType contentType = app.util.HttpUtils.ContentType.get(fileExtension);
    if (contentType == null) {
        app.util.HttpUtils.logger.error("Content-Type for file extension '{}' was not found", fileExtension);
        contentType = app.util.HttpUtils.ContentType.data;
    }
    return contentType;
}