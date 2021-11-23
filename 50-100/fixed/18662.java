public static void populateConfig() {
    java.util.List<com.jstakun.lm.server.persistence.Config> params = com.jstakun.lm.server.utils.persistence.ConfigPersistenceUtils.selectAllConfigParams();
    com.jstakun.lm.server.config.ConfigurationManager.configuration = new java.util.HashMap<java.lang.String, java.lang.String>();
    for (com.jstakun.lm.server.persistence.Config param : params) {
        com.jstakun.lm.server.config.ConfigurationManager.configuration.put(param.getKey(), param.getValue());
        java.util.logging.Logger.getLogger("com.jstakun.lm.server.config.ConfigurationManager").log(java.util.logging.Level.INFO, "Setting {0}: {1}", new java.lang.Object[]{ param.getKey() , param.getValue() });
    }
    com.jstakun.lm.server.utils.memcache.CacheUtil.put(com.jstakun.lm.server.config.ConfigurationManager.CONFIG, com.jstakun.lm.server.config.ConfigurationManager.configuration, CacheType.NORMAL);
}