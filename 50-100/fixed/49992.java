private void copyResources(java.lang.String path, java.lang.String file) throws java.io.IOException {
    java.lang.ClassLoader classLoader = getClass().getClassLoader();
    try (java.io.InputStream source = classLoader.getResourceAsStream((path + file))) {
        java.io.File destination = new java.io.File((((targetDir) + (java.io.File.separator)) + file));
        java.nio.file.Files.copy(source, destination.toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
    } catch (java.lang.Exception e) {
        org.radargun.reporting.html.HtmlReporter.log.error("Exception while copying resources", e);
    }
}