public static com.bmc.truesight.saas.remedy.integration.beans.Template updateConfiguration(com.bmc.truesight.saas.remedy.integration.beans.Template template, com.bmc.truesight.meter.plugin.remedy.RemedyPluginConfigurationItem config) {
    com.bmc.truesight.saas.remedy.integration.beans.Configuration configuration = template.getConfig();
    configuration.setRemedyHostName(config.getHostName());
    configuration.setRemedyPort(config.getPort());
    configuration.setRemedyUserName(config.getUserName());
    configuration.setRemedyPassword(config.getPassword());
    return template;
}