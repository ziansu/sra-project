public void onGameListObjectReceived(de.hsbremen.battleshipextreme.network.eventhandling.EventArgs<de.hsbremen.battleshipextreme.client.listener.GameList> eventArgs) {
    gui.getPanelServerConnection().getPnlServerGameBrowser().getTblModel().removeAllGames();
    de.hsbremen.battleshipextreme.client.listener.GameList list = eventArgs.getItem();
    for (de.hsbremen.battleshipextreme.client.listener.NetGame game : list.getNetGameList()) {
        gui.getPanelServerConnection().getPnlServerGameBrowser().addGameToTable(game);
    }
    ctrl.resizeServerGameListColumns();
}