public static void shutdown() {
    com.misfit.ios.NuRemoteClient.close();
    com.misfit.ta.gui.Gui.stopApp();
    com.misfit.ta.gui.Gui.logger.info("Closing down. BYE!");
}