public void shoot() {
    java.lang.System.out.println(delay);
    if (isReadyToFire()) {
        testGame.Projectile p = new testGame.PlayerProjectile(centerX, ((centerY) - (sprite.getShape().height)), speedX, ((-(speedY)) - 10));
        projectiles.add(p);
        framework.AudioHandler.playSound("data/laser12.wav");
        delay = FIRE_DELAY;
    }
}