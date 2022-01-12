public boolean isValidPrimaryActiveFight(com.comandante.creeper.npc.Npc npc) {
    for (java.util.Map.Entry<java.lang.Long, com.comandante.creeper.player.Player.ActiveFight> entry : activeFights.entrySet()) {
        com.comandante.creeper.player.Player.ActiveFight fight = entry.getValue();
        if ((fight.getNpcId().equals(npc.getEntityId())) && (fight.isPrimary)) {
            return true;
        }
    }
    return false;
}