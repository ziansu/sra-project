public synchronized void addPowerup(com.collision.game.handler.PowerupData msg) {
    powerups.add(new com.collision.game.entity.Powerup(msg.position));
}