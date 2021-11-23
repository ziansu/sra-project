private java.nio.file.Path getAuthorPath() {
    java.nio.file.Path configPath = ee.shy.io.PathUtils.getUserHomePath().resolve(".shyconfig");
    if (java.nio.file.Files.exists(configPath))
        return configPath;
    
    return getRepositoryPath().resolve("author");
}