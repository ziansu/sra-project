public void shoot() {
    if (readyToFire) {
        testGame.Projectile p = new testGame.PlayerProjectile(((centerX) + ((sprite.getShape().width) / 2)), ((centerY) + (sprite.getShape().height)), speedX, ((speedY) + 10));
        projectiles.add(p);
        framework.AudioHandler.playSound("data/laser12.wav");
    }
}