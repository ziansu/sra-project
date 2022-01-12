private static com.kry.brickgame.shapes.Bullet checkCollisionWithBullets(com.kry.brickgame.shapes.Bullet bullet, java.util.concurrent.atomic.AtomicReferenceArray<com.kry.brickgame.shapes.Bullet> bullets) {
    for (int i = 0; i < (bullets.length()); i++) {
        com.kry.brickgame.shapes.Bullet checkBullet = bullets.get(i);
        if (((checkBullet != null) && (checkBullet != bullet)) && (checkBullet.getCoordinates().equals(bullet.getCoordinates())))
            return checkBullet;
        
    }
    return null;
}