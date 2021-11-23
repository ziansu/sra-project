protected void shoot() {
    if (!(isDestroyed())) {
        ru.makproductions.geekbrains.gameproject.common.Bullet bullet = bulletPool.obtain();
        bulletPosition.x = position.x;
        bulletPosition.y = (position.y) + (bullet_margin);
        bullet.setBullet(this, bulletTexture, bulletPosition, bulletSpeed, bulletHeight, worldBounds, bulletDamage);
        shotSound.play(0.1F);
    }
}