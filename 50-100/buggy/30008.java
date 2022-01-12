private void resolveDependencies() throws ro.fortsoft.pf4j.PluginException {
    ro.fortsoft.pf4j.DependencyResolver dependencyResolver = new ro.fortsoft.pf4j.DependencyResolver(unresolvedPlugins);
    resolvedPlugins = dependencyResolver.getSortedPlugins();
    for (ro.fortsoft.pf4j.PluginWrapper pluginWrapper : resolvedPlugins) {
        unresolvedPlugins.remove(pluginWrapper);
        ro.fortsoft.pf4j.DefaultPluginManager.log.info("Plugin '{}' resolved", pluginWrapper.getDescriptor().getPluginId());
    }
}