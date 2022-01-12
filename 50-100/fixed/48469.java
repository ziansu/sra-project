@java.lang.Override
public void onEnable() {
    config.addDefault("port", 9225);
    config.options().copyDefaults(true);
    saveConfig();
    int port = config.getInt("port");
    server = new org.eclipse.jetty.server.Server(port);
    server.setHandler(new de.sldk.mc.MetricsController(this));
    try {
        server.start();
        getLogger().info(("Started Prometheus metrics endpoint on port " + port));
    } catch (java.lang.Exception e) {
        getLogger().severe("Could not start embedded Jetty server");
    }
}