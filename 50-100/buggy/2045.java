protected void initializeSchemaGenerator(java.io.File projectBaseDir, java.io.File webDir) {
    try {
        org.cruxframework.crux.core.config.ConfigurationFactory.getConfigurations().setEnableHotDeploymentForWebDirs(false);
        java.net.URL[] urls = org.cruxframework.crux.scanner.ClasspathUrlFinder.findClassPaths();
        org.cruxframework.crux.scanner.Scanners.setSearchURLs(urls);
        if (webDir == null) {
            webDir = new java.io.File(projectBaseDir, "war/");
        }
    } catch (java.lang.Exception e) {
        throw new org.cruxframework.crux.tools.schema.SchemaGeneratorException(e.getMessage(), e);
    }
}