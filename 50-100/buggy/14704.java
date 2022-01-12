public static void run() {
    io.github.rmuhamedgaliev.config.ConfigLoader configLoader = new io.github.rmuhamedgaliev.config.ConfigLoader();
    configLoader.prepareConfig();
    java.lang.System.setProperty("logback.configurationFile", "config/logback.xml");
    java.util.List<io.github.rmuhamedgaliev.Plugin> plugins;
    try {
        plugins = io.github.rmuhamedgaliev.PluginManager.loadPlugins(io.github.rmuhamedgaliev.Plugin.class);
        plugins.forEach(Plugin::run);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}