public static boolean containsContentType(final java.lang.String[] sourceContentTypes, final java.lang.String... contentTypes) {
    if ((contentTypes != null) && ((contentTypes.length) > 0)) {
        for (final java.lang.String contentType : contentTypes) {
            final java.lang.String contentTypeFirstPart = contentType.split(";")[0];
            if (contentTypeFirstPart.equals("*/*")) {
                return true;
            }
            if (japp.web.dispatcher.http.HttpDispatcherHelper.containsContentType(sourceContentTypes, contentTypeFirstPart)) {
                return true;
            }
        }
    }
    return false;
}