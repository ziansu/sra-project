public java.lang.Boolean shouldAllowNavigation(java.lang.String url) {
    if (url.startsWith("chrome-extension:")) {
        return true;
    }
    return super.shouldAllowNavigation(url);
}