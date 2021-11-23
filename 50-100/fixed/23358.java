private void projectileCollision(nl.tudelft.semgroup4.util.QuadTree quad) {
    for (nl.tudelft.model.AbstractGameObject collidesWithA : curLevel.getProjectiles()) {
        for (nl.tudelft.model.AbstractGameObject collidesWithB : nl.tudelft.semgroup4.collision.CollisionHelper.collideObjectWithList(collidesWithA, null, quad)) {
            collisionHandler.onCollision(this, collidesWithA, collidesWithB);
        }
    }
}