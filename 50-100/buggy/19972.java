@java.lang.SuppressWarnings(value = "nls")
private final boolean loadRelativeSeparator(java.lang.String pathname) {
    if (pathname.startsWith(java.io.File.separator)) {
        try {
            java.net.URL url = java.lang.Thread.currentThread().getContextClassLoader().getResource(pathname.replaceFirst(java.io.File.separator, ""));
            this.file = new java.io.File(url.toURI());
        } catch (java.lang.Exception e) {
            return false;
        }
    }
    return this.file.exists();
}