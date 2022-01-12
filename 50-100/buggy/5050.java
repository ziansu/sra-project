private static com.elemenopy.backupcopy.config.BackupConfig loadConfigFile(java.io.InputStream in) {
    try {
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        com.elemenopy.backupcopy.config.BackupConfig config = mapper.readValue(in, com.elemenopy.backupcopy.config.BackupConfig.class);
        return config;
    } catch (java.io.IOException ex) {
        com.elemenopy.backupcopy.config.BackupConfig.logger.error("IO Exception while loading config file", ex);
        return null;
    }
}