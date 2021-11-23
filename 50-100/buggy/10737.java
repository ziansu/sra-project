public void setTeam(java.lang.Integer team) {
    if ((de.mickyjou.plugins.pvpevent.listener.player.SignInteractListener.currentNPC1) != null) {
        de.mickyjou.plugins.pvpevent.listener.player.SignInteractListener.currentNPC1.destroy();
        de.mickyjou.plugins.pvpevent.listener.player.SignInteractListener.currentNPC2.destroy();
    }
    de.mickyjou.plugins.pvpevent.listener.player.EventTeam toSet = de.mickyjou.plugins.pvpevent.listener.player.SignInteractListener.teams.get(team);
    de.mickyjou.plugins.pvpevent.listener.player.SignInteractListener.currentNPC1 = new de.mickyjou.plugins.pvpevent.listener.player.NPC(toSet.getPlayers()[0].getUniqueId(), de.mickyjou.plugins.pvpevent.listener.player.SignInteractListener.firstNPC);
    de.mickyjou.plugins.pvpevent.listener.player.SignInteractListener.currentNPC2 = new de.mickyjou.plugins.pvpevent.listener.player.NPC(toSet.getPlayers()[1].getUniqueId(), de.mickyjou.plugins.pvpevent.listener.player.SignInteractListener.secondNPC);
    de.mickyjou.plugins.pvpevent.listener.player.SignInteractListener.currentNPC1.spawn();
    de.mickyjou.plugins.pvpevent.listener.player.SignInteractListener.currentNPC2.spawn();
}