public int getNumberAvailablePowerUps(com.app.game.quizee.backend.PowerUp powerUp) {
    java.lang.Integer current = this.availablePowerUps.get(powerUp.getName());
    return current == null ? 0 : current;
}