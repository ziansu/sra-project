private void projectileCollision(nl.tudelft.semgroup4.util.QuadTree quad) {
    java.util.LinkedList<nl.tudelft.model.Wall> walls = new java.util.LinkedList<nl.tudelft.model.Wall>();
    for (nl.tudelft.model.AbstractGameObject collidesWithA : curLevel.getProjectiles()) {
        for (nl.tudelft.model.AbstractGameObject collidesWithB : nl.tudelft.semgroup4.collision.CollisionHelper.collideObjectWithList(collidesWithA, walls, null)) {
            collisionHandler.onCollision(this, collidesWithA, collidesWithB);
        }
    }
}