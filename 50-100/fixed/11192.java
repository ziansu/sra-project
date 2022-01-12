@java.lang.Override
public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
    logger.log(java.util.logging.Level.INFO, (("logge " + (getSession().getAttribute("user"))) + " aus..."));
    getSession().setAttribute("user", null);
    com.example.testme.server.broadcast.Broadcaster.broadcast(getUI().getSession().getSession().getId(), username, false);
    getUI().getNavigator().navigateTo(com.example.testme.client.lobby.LobbyPresenter.NAME);
}