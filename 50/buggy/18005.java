@java.lang.Override
public void onAboutToStart(org.spongepowered.api.event.game.state.GameAboutToStartServerEvent event) throws java.lang.Exception {
    blue.lapis.pore.launch.PoreRegistry.registerBukkit();
    server.enablePlugins(PluginLoadOrder.STARTUP);
}