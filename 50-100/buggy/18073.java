private static void applyPlatformDefaults(org.terracotta.config.TcConfig tcConfig, java.lang.String source) {
    for (org.terracotta.config.Server server : tcConfig.getServers().getServer()) {
        org.terracotta.config.TCConfigurationParser.setDefaultBind(server);
        org.terracotta.config.TCConfigurationParser.initializeTsaPort(server);
        org.terracotta.config.TCConfigurationParser.initializeManagementPort(server);
        org.terracotta.config.TCConfigurationParser.initializeTsaGroupPort(server);
        org.terracotta.config.TCConfigurationParser.initializeNameAndHost(server);
        org.terracotta.config.TCConfigurationParser.initializeDataDirectory(server, source);
        org.terracotta.config.TCConfigurationParser.initializeDataBackupDirectory(server, source);
        org.terracotta.config.TCConfigurationParser.initializeLogsDirectory(server, source);
    }
}