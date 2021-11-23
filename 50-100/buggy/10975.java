private void attachReactions() {
    client.MainListener controller = new client.MainListener(this);
    settings.addMouseListener(controller);
    close.addMouseListener(controller);
    logout.addMouseListener(controller);
    trayIcon.addMouseListener(controller);
    reload.addMouseListener(controller);
    scroll.getVerticalScrollBar().addAdjustmentListener(controller);
}