private static com.kry.brickgame.shapes.Bullet checkCollisionWithBullets(com.kry.brickgame.shapes.Bullet bullet, com.kry.brickgame.shapes.Bullet[] bullets) {
    for (com.kry.brickgame.shapes.Bullet checkBullet : bullets) {
        if (((checkBullet != null) && (checkBullet != bullet)) && (checkBullet.getCoordinates().equals(bullet.getCoordinates())))
            return checkBullet;
        
    }
    return null;
}