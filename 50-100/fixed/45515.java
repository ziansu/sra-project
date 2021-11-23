private static java.lang.String getExtension(java.lang.String uri) {
    int lastDotIndex = uri.lastIndexOf('.');
    if ((lastDotIndex > 1) && (lastDotIndex < ((uri.length()) - 1))) {
        return uri.substring(lastDotIndex);
    }else {
        return null;
    }
}