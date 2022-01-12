private void createFile(java.io.File out) {
    try {
        java.nio.file.Files.copy(this.getClass().getResourceAsStream("/config.properties"), out.toPath());
    } catch (java.io.IOException e) {
        org.centauri.cloud.cloud.Cloud.getLogger().error(e.getMessage(), e);
    }
}