public static synchronized me.shib.java.lib.jbots.JBotConfig[] getAllConfigList() {
    if ((me.shib.java.lib.jbots.JBotConfig.configMap) == null) {
        me.shib.java.lib.jbots.JBotConfig.addFileToConfigList(me.shib.java.lib.jbots.JBotConfig.defaultConfigFile);
    }
    if ((me.shib.java.lib.jbots.JBotConfig.configMap) == null) {
        return null;
    }
    java.util.ArrayList<me.shib.java.lib.jbots.JBotConfig> configList = new java.util.ArrayList<>(me.shib.java.lib.jbots.JBotConfig.configMap.values());
    me.shib.java.lib.jbots.JBotConfig[] configArray = new me.shib.java.lib.jbots.JBotConfig[configList.size()];
    return configList.toArray(configArray);
}