public java.lang.String getScheme() {
    try {
        return uri.getScheme();
    } catch (final java.lang.NullPointerException e) {
    }
    return null;
}