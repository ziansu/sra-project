public java.lang.String getPrimaryActiveFight() {
    java.lang.System.out.println("Is Primary Active Fight?");
    for (java.util.Map.Entry<java.lang.Long, com.comandante.creeper.player.Player.ActiveFight> entry : activeFights.entrySet()) {
        com.comandante.creeper.player.Player.ActiveFight fight = entry.getValue();
        if (fight.isPrimary) {
            return fight.getNpcId();
        }
    }
    return null;
}