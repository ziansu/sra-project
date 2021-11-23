public boolean checkCollision(com.mcmu.juanjesus.mcmuasteroids.graphics.Graphic g) {
    return (distance(g)) < ((collisionRadius) + (g.collisionRadius));
}