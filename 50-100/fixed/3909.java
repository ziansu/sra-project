private static void instantiatePluginManager() {
    if ((((org.roda.core.RodaCoreFactory.nodeType) == (org.roda.core.data.common.RodaConstants.NodeType.MASTER)) || ((org.roda.core.RodaCoreFactory.nodeType) == (org.roda.core.data.common.RodaConstants.NodeType.WORKER))) || (org.roda.core.RodaCoreFactory.TEST_DEPLOY_PLUGIN_MANAGER)) {
        try {
            org.roda.core.RodaCoreFactory.pluginManager = org.roda.core.plugins.PluginManager.instantiatePluginManager(org.roda.core.RodaCoreFactory.getConfigPath(), org.roda.core.RodaCoreFactory.getPluginsPath());
        } catch (org.roda.core.plugins.PluginManagerException e) {
            org.roda.core.RodaCoreFactory.LOGGER.error("Error instantiating PluginManager", e);
            org.roda.core.RodaCoreFactory.instantiatedWithoutErrors = false;
        }
    }
}