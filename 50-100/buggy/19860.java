private boolean touchingRight() {
    boolean c1 = (collider.getLeft()) >= (collidee.getRight());
    boolean c2 = (collider.getLeft()) <= ((collidee.getRight()) - (Constants.COLLISION_PRECISION));
    return ((colliding()) && c1) && c2;
}