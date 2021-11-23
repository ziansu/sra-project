@com.google.inject.Provides
com.diyphotobooth.lordbritishix.model.Template templateProvider() throws java.io.IOException {
    java.util.Properties properties = loadFromFile(settingsFolder);
    java.nio.file.Paths.get(properties.getProperty("template.filename"));
    java.io.File templateFile = java.nio.file.Paths.get(properties.getProperty("template.filename")).toFile();
    try (java.io.InputStream is = new java.io.FileInputStream(templateFile)) {
        return com.diyphotobooth.lordbritishix.model.Template.fromJson(is);
    }
}