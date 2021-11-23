public int getRequiredKills() {
    return ((level) + 1) == (net.laby.game.Level.values().length) ? -1 : (net.laby.game.Level.values()[level].getNeededKillStreak()) - (getKillStreak());
}