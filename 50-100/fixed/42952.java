private void loadConfig() {
    com.miniplay.minicortex.config.Config config = com.miniplay.minicortex.config.ConfigManager.getConfig();
    java.lang.System.out.println(config.getElasticBalancerConfig());
    this.EB_ALLOW_PROVISION_CONTAINERS = config.EB_ALLOW_PROVISION_CONTAINERS;
    if ((config.EB_TOLERANCE_THRESHOLD) > 0) {
        this.EB_TOLERANCE_THRESHOLD = config.EB_TOLERANCE_THRESHOLD;
    }else {
        throw new java.security.InvalidParameterException("EB_TOLERANCE_THRESHOLD parameter does not exist");
    }
}