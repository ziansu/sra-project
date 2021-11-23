public void loadPlugins() {
    java.io.File pluginsFolder = new java.io.File(net.hybridhacker.visualslice.plugins.PluginManager.PLUGIN_FOLDER);
    if (pluginsFolder.exists())
        pluginsFolder.mkdir();
    
    if ((pluginsFolder.listFiles()) != null) {
        for (java.io.File file : pluginsFolder.listFiles()) {
            if (file.getName().endsWith(".jar")) {
                loadPlugin(file);
            }
        }
    }
}