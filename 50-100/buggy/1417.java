public java.lang.String mimeType() {
    if ((cachedMimeType) == null) {
        try {
            cachedMimeType = java.net.URLConnection.guessContentTypeFromName(file.getAbsolutePath());
        } catch (java.lang.Exception e) {
            com.google.firebase.crash.FirebaseCrash.report(e);
        }
        if ((cachedMimeType) == null) {
            cachedMimeType = "*/*";
        }
    }
    return cachedMimeType;
}