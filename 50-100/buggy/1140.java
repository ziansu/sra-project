private org.springframework.core.io.Resource getOverrideConfigResource() {
    org.springframework.core.io.ClassPathResource override = new org.springframework.core.io.ClassPathResource("config.override.properties");
    try {
        override.getFile();
        return override;
    } catch (java.io.FileNotFoundException e) {
        return new org.springframework.core.io.FileSystemResource("conf/config.override.properties");
    } catch (java.io.IOException e) {
        de.ingrid.admin.Config.log.error("Error when getting config.override.properties");
        e.printStackTrace();
    }
    return null;
}