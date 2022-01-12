public void shoot() {
    if (readyToFire) {
        testGame.Projectile p = new testGame.PlayerProjectile(centerX, ((centerY) - (sprite.getShape().height)), speedX, ((-(speedY)) - 10));
        projectiles.add(p);
    }
}