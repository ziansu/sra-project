public void clearAndInitializeCollision() {
    if ((collision) == null) {
        collision = new java.util.ArrayList<>(2);
        collision.add(new java.util.ArrayList<edu.chl.blastinthepast.utils.collisiondetection.Collidable>());
        collision.add(new java.util.ArrayList<edu.chl.blastinthepast.utils.collisiondetection.Collidable>());
    }else {
        collision.get(0).clear();
        collision.get(1).clear();
    }
}