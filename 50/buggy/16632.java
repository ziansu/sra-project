public boolean isViewingSendAgent(no.runsafe.framework.api.player.IPlayer sender) {
    return this.openSendAgents.containsKey(sender.getName());
}