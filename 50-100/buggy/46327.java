public boolean collidedWith(ca.ucalgary.main.Enemy enemy) {
    collided = ((x) == (enemy.getX())) && (((y) == (enemy.getY())) || ((y) == ((enemy.getY()) - 1)));
    return collided;
}