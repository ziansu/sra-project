@java.lang.Override
public void resolveCollision(asteroids.model.Bullet bullet) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException {
    if (!(asteroids.model.World.significantOverlap(this, bullet)))
        throw new java.lang.IllegalStateException();
    
    if (bullet == null)
        throw new java.lang.IllegalArgumentException();
    
    if ((bullet.getShip()) == (this)) {
        bullet.transferToShip();
    }else {
        bullet.terminate();
        this.terminate();
    }
}