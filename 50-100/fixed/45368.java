public static java.lang.String parserContentEncoding(java.lang.String contentType) {
    java.lang.String encoding = "UTF-8";
    if (com.eweblib.util.EweblibUtil.isValid(contentType)) {
        if (contentType.contains("=")) {
            java.lang.String resEncoding = contentType.split("=")[1];
            if (com.eweblib.util.EweblibUtil.isValid(resEncoding)) {
                encoding = resEncoding;
            }
        }
    }
    return encoding;
}