void renderMenu(javax.swing.JPanel jPanel) {
    if ((operatingSystem) == null) {
        return ;
    }
    getContentPane().remove(jPanel);
    getContentPane().revalidate();
    app.view.gui.MenuPanelImpl menuPanelImpl = new app.view.gui.MenuPanelImpl(this);
    setPanel(menuPanelImpl);
    menuPanelImpl.init();
    getEventListener().setCompleted(false);
}