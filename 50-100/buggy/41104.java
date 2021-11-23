public void clearAndInitializeCollision() {
    collision.clear();
    java.util.ArrayList<java.util.ArrayList<edu.chl.blastinthepast.utils.collisiondetection.Collidable>> collision = new java.util.ArrayList<>(2);
    collision.add(new java.util.ArrayList<edu.chl.blastinthepast.utils.collisiondetection.Collidable>());
    collision.add(new java.util.ArrayList<edu.chl.blastinthepast.utils.collisiondetection.Collidable>());
}