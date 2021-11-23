public model.player.Player getPlayer(model.adventurers.AdventurerType advT) {
    model.game.Iterator<model.player.Player> it = getPlayers().iterator();
    model.player.Player p = null;
    while ((it.hasNext()) && (!((p = it.next()).getCurrentAdventurer().getADVENTURER_TYPE().equals(advT)))) {
    } 
    return p;
}