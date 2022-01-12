private boolean touchingRight() {
    boolean c1 = (collider.getLeft()) >= ((collidee.getRight()) - (Constants.COLLISION_PRECISION));
    boolean c2 = (collider.getLeft()) <= (collidee.getRight());
    return ((colliding()) && c1) && c2;
}