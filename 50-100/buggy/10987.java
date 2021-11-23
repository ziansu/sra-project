@java.lang.Override
public void resolveCollision(asteroids.model.WorldObject other) {
    if (other instanceof asteroids.model.Ship)
        this.resolveCollision(((asteroids.model.Ship) (other)));
    
    if (other instanceof asteroids.model.Bullet)
        this.resolveCollision(((asteroids.model.Bullet) (other)));
    
    if (other instanceof asteroids.model.MinorPlanet)
        this.resolveCollision(((asteroids.model.MinorPlanet) (other)));
    
}