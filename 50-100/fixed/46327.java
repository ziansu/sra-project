public boolean collidedWith(ca.ucalgary.main.Enemy enemy) {
    collided = ((y) == (enemy.getY())) && (((x) == (enemy.getX())) || ((x) == ((enemy.getX()) + 1)));
    return collided;
}