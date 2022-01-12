public void removePowerUp(com.app.game.quizee.backend.PowerUp powerUp) {
    java.lang.Integer current = this.availablePowerUps.get(powerUp.getName());
    if ((current != null) && (current > 0)) {
        this.availablePowerUps.put(powerUp.getName(), (--current));
    }
}