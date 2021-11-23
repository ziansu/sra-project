public static boolean containsContentType(final java.lang.String[] sourceContentTypes, final java.lang.String... contentTypes) {
    if ((contentTypes != null) && ((contentTypes.length) > 0)) {
        for (java.lang.String contentType : contentTypes) {
            contentType = contentType.split(";")[0];
            if (contentType.equals("*/*")) {
                return true;
            }
            if (japp.web.dispatcher.http.HttpDispatcherHelper.containsContentType(sourceContentTypes, contentType)) {
                return true;
            }
        }
    }
    return false;
}