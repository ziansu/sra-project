public void exitFullScreen() {
    if (fullscreen) {
        final java.awt.GraphicsEnvironment ge = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        final java.awt.GraphicsDevice[] device = ge.getScreenDevices();
        device[containingDevice].setFullScreenWindow(null);
        removeNotify();
        setUndecorated(false);
        addNotify();
        setJMenuBar(menuBar);
        setResizable(true);
        restoreScreenState();
        graphingPanel.grabFocus();
        requestFocusInWindow();
        fullscreen = false;
    }
}