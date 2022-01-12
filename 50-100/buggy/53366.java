public void load() {
    java.io.File file = new java.io.File("config.properties");
    if (!(file.exists()))
        createFile(file);
    
    try (java.io.InputStream inputStream = new java.io.FileInputStream(file)) {
        properties = new java.util.Properties();
        properties.load(inputStream);
    } catch (java.io.IOException e) {
        org.centauri.cloud.cloud.Cloud.getLogger().error(e.getMessage());
    }
}