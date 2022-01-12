protected void generateHealth() {
    health = ((int) ((java.lang.Math.random()) * ((10 * (Enemy.count)) * ((Enemy.enemyInRoom) / 10.0))));
}