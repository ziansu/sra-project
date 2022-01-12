public void init() throws java.lang.Exception {
    io.luna.Server.LOGGER.info("Luna is being initialized...");
    initLaunchTasks();
    initPlugins();
    initGame();
    launchPool.awaitTermination(java.lang.Long.MAX_VALUE, java.util.concurrent.TimeUnit.DAYS);
    initNetwork();
    io.luna.Server.LOGGER.info("Luna is now online on port {}!", org.apache.logging.log4j.util.Unbox.box(LunaConstants.PORT));
    io.luna.game.plugin.PluginManager plugins = context.getPlugins();
    plugins.post(ServerLaunchEvent.INSTANCE);
}