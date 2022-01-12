public void loadCatalog() throws java.io.IOException {
    allPlugins = org.coreasm.engine.loader.PluginClassLoader.loadCatalog(capi);
}