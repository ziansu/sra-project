public java.util.List<java.net.URI> getLicensesList(boolean relative) {
    java.util.List<java.net.URI> URIs = eu.asterics.mw.services.ComponentUtils.findFiles(toAbsolute(eu.asterics.mw.services.ResourceRegistry.LICENSES_FOLDER), relative, 1, new java.io.FilenameFilter() {
        @java.lang.Override
        public boolean accept(java.io.File dir, java.lang.String name) {
            return name.endsWith(".txt");
        }
    });
    return URIs;
}