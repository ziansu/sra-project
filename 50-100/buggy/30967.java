@java.lang.Override
public void init(javafx.stage.Stage window, java.lang.Runtime run) {
    net.exodiusmc.engine.util.FileUtils.setResourceDirectory("net/exodiusmc/example_jetpack_jordy");
    net.exodiusmc.engine.Logger.setLogDestination("C:/Users/julian/Desktop/exodius-engine.log");
    net.exodiusmc.engine.Logger.getLogger().info(("Starting Jetpack Jordy, running Exodius Engine version " + (getVersion())));
    net.exodiusmc.example_jetpack_jordy.Main.input = getInputManager();
    window.setTitle("Jetpack Jordy");
    window.setResizable(false);
    window.setHeight(net.exodiusmc.example_jetpack_jordy.Main.HEIGHT);
    window.setWidth(net.exodiusmc.example_jetpack_jordy.Main.WIDTH);
    getLayerManager().add(new net.exodiusmc.example_jetpack_jordy.layers.GameLayer());
}