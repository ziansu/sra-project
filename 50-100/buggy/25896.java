public void removeClient(com.rbruno.irc.templates.Client client) {
    ops.remove(client);
    voiceList.remove(client);
    clients.remove(client);
    if ((((this.clients.size()) == 0) && (this.isTemporary())) && (com.rbruno.irc.Server.getServer().getConfig().getProperty("RemoveChannelOnEmpty").equals("true"))) {
        com.rbruno.irc.Server.getServer().getChannelManger().removeChannel(this);
    }
}