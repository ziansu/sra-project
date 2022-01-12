@cz.cuni.amis.pogamut.base.communication.worldview.listener.annotation.EventListener(eventClass = cz.cuni.amis.pogamut.ut2004.communication.messages.gbinfomessages.PlayerKilled.class)
public void playerKilled(cz.cuni.amis.pogamut.ut2004.communication.messages.gbinfomessages.PlayerKilled event) {
    if (event.getKiller().equals(info.getId())) {
        updateRisque();
        shoot.stopShooting();
        if ((currentWeapon) != null) {
            currentWeapon.upNbKills();
            currentWeapon.updateProbability();
        }
        target = null;
        bot.getBotName().setInfo("COLLECT");
        now = collect;
        canPursue = false;
    }
}