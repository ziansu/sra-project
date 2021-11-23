public void loadPackages() {
    if (new java.io.File(addonDirectory).exists()) {
        final java.io.File[] list = io.util.FileUtils.getDirectoryContents(new java.io.File(addonDirectory));
        for (java.io.File current : list) {
            final java.lang.String extension = io.util.FileUtils.getExtension(current);
            if (extension.equalsIgnoreCase(ResourceReader.MW_ARCHIVE_EXTENSION)) {
                io.resource.ResourceReader.readPackage(this, current, true);
            }
        }
    }
}