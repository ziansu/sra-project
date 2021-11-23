private int endlessEndCondition() {
    if ((this.player) == null) {
        return engine.GameEngine.LOST;
    }else
        if ((hostileGameObjects.size()) <= 1) {
            spawnEnemies(((numberOfEnemies) + ((numberOfEnemies) / 3)));
            int playerHP = (player.getHealthPoints()) + (new java.lang.Double((0.3 * (this.killCount))).intValue());
            player.setHealthPoints(playerHP);
        }
    
    return engine.GameEngine.STILL_GOING;
}