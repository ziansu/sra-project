public void exitFullScreen() {
    if (fullscreen) {
        fullscreen = false;
        final java.awt.GraphicsEnvironment ge = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        final java.awt.GraphicsDevice[] device = ge.getScreenDevices();
        device[containingDevice].setFullScreenWindow(null);
        removeNotify();
        setUndecorated(false);
        addNotify();
        setJMenuBar(menuBar);
        setResizable(true);
        setVisible(false);
        pack();
        restoreScreenState();
        setVisible(true);
        requestFocusInWindow();
        graphingPanel.moveGraphDueToResize();
    }
}