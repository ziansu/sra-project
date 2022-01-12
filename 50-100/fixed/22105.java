public java.util.List<java.net.URI> getLicensesList(boolean relative) {
    java.util.List<java.net.URI> URIs = getLicensesList(new java.io.FilenameFilter() {
        @java.lang.Override
        public boolean accept(java.io.File dir, java.lang.String name) {
            return name.endsWith(".txt");
        }
    }, relative);
    return URIs;
}