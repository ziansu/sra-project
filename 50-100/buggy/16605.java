public void addPowerUp(com.app.game.quizee.backend.PowerUp powerUp) {
    java.lang.Integer current = this.availablePowerUps.get(powerUp);
    java.lang.Integer max = this.purchasedPowerUps.get(powerUp);
    this.availablePowerUps.put(powerUp, (current == null ? 1 : ++current));
    this.purchasedPowerUps.put(powerUp, (current == null ? 1 : ++current));
}