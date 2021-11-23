public void handleAbout(com.apple.eawt.ApplicationEvent e) {
    mainWindow.getAboutMenuItem().doClick();
    e.setHandled(true);
}