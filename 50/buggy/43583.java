public static java.lang.String getFileNameFromPathOrReturnRequestPath(ninja.Context context) {
    java.lang.String fileName = context.getPathParameter(ninja.AssetsController.FILENAME_PATH_PARAM);
    if (fileName == null) {
        fileName = context.getRequestPath();
    }
    return fileName;
}