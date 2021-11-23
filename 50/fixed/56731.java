public void setNextTeam() {
    try {
        de.mickyjou.plugins.pvpevent.listener.player.SignInteractListener.setTeam(((de.mickyjou.plugins.pvpevent.listener.player.SignInteractListener.currentTeam) + 1));
        (de.mickyjou.plugins.pvpevent.listener.player.SignInteractListener.currentTeam)++;
    } catch (java.lang.IndexOutOfBoundsException e) {
        de.mickyjou.plugins.pvpevent.listener.player.SignInteractListener.setFirstTeam();
        de.mickyjou.plugins.pvpevent.listener.player.SignInteractListener.currentTeam = 0;
    }
}