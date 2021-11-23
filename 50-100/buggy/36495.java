public void loadPackages() {
    if (new java.io.File(addonDirectory).exists()) {
        final java.io.File[] list = io.util.FileUtils.getDirectoryContents(new java.io.File(addonDirectory));
        for (int i = 0; i < (list.length); i++) {
            final java.io.File current = list[i];
            final java.lang.String extension = io.util.FileUtils.getExtension(current);
            if (extension.equalsIgnoreCase(ResourceReader.MW_ARCHIVE_EXTENSION)) {
                io.resource.ResourceReader.readPackage(this, current, true);
            }
        }
    }
}