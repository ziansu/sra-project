private void initializePaths() throws java.io.IOException {
    java.lang.String path = org.springframework.boot.loader.util.SystemPropertyUtils.getProperty(org.springframework.boot.loader.PropertiesLauncher.PATH);
    if (path == null) {
        path = this.properties.getProperty(org.springframework.boot.loader.PropertiesLauncher.PATH);
    }
    if (path != null) {
        this.paths = parsePathsProperty(org.springframework.boot.loader.util.SystemPropertyUtils.resolvePlaceholders(path));
    }
    this.logger.info(("Nested archive paths: " + (this.paths)));
}