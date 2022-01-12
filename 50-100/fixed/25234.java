protected java.lang.String calculateBaseSearchUrl() {
    java.lang.String baseUrl = com.manydesigns.elements.util.Util.getAbsoluteUrl(context.getActionPath());
    if ((pk) != null) {
        for (int i = 0; i < (pk.length); i++) {
            int lastSlashIndex = baseUrl.lastIndexOf('/');
            baseUrl = baseUrl.substring(0, lastSlashIndex);
        }
    }
    return baseUrl;
}