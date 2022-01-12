public void start() {
    setApplicationLook();
    rootView = com.floreantpos.ui.views.order.RootView.getInstance();
    posWindow.getContentPane().add(rootView);
    posWindow.setupSizeAndLocation();
    if (com.floreantpos.config.TerminalConfig.isFullscreenMode()) {
        posWindow.enterFullScreenMode();
    }
    posWindow.setVisible(true);
    initializeSystem();
    for (com.floreantpos.extension.FloreantPlugin plugin : com.floreantpos.extension.ExtensionManager.getPlugins()) {
        plugin.init();
    }
}