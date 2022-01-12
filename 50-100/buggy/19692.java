public static com.bmc.truesight.saas.remedy.integration.beans.Template updateConfiguration(com.bmc.truesight.saas.remedy.integration.beans.Template template, com.bmc.truesight.meter.plugin.remedy.RemedyPluginConfigurationItem config) {
    com.bmc.truesight.saas.remedy.integration.beans.Configuration configuration = template.getConfig();
    configuration.setChunkSize(Constants.REMEDY_CHUNK_SIZE);
    configuration.setRemedyHostName(config.getHostName());
    configuration.setRemedyPort(config.getPort());
    configuration.setRemedyUserName(config.getUserName());
    configuration.setRemedyPassword(config.getPassword());
    configuration.setRetryConfig(Constants.REMEDY_RETRY_CONFIG);
    configuration.setWaitMsBeforeRetry(Constants.REMEDY_WAIT_MS_BEFORE_NEXT_RETRY);
    template.setConfig(configuration);
    return template;
}