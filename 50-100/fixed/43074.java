public boolean onClientRemove(org.cometd.bayeux.server.ServerSession client) {
    org.coweb.LateJoinHandler.log.info(("siteId = " + (client.getAttribute("siteid"))));
    this.removeUpdater(client);
    if ((this.getUpdaterCount()) == 0) {
        org.coweb.LateJoinHandler.log.info("removing last updater, ending coweb session");
        return true;
    }
    return false;
}