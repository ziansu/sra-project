public java.util.List<java.lang.Integer> getPlayerStats() {
    java.util.List<java.lang.Integer> playerStats = new java.util.ArrayList<>();
    playerStats.add(this.health);
    playerStats.add(this.attack);
    playerStats.add(this.defense);
    playerStats.add(this.stamina);
    playerStats.add(this.strength);
    playerStats.add(this.agility);
    return playerStats;
}