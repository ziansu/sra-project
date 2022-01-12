@java.lang.Override
public void update(nl.tudelft.semgroup4.GameContainer container, int delta) throws nl.tudelft.semgroup4.SlickException {
    for (nl.tudelft.semgroup4.GameObject collidesWithA : objectList) {
        for (nl.tudelft.semgroup4.GameObject collidesWithB : nl.tudelft.semgroup4.collision.CollisionHelper.collideObjectWithList(collidesWithA, objectList)) {
            collisionHandler.onCollision(collidesWithA, collidesWithB);
        }
    }
    for (nl.tudelft.semgroup4.GameObject gameObject : objectList) {
        gameObject.update(container, delta);
    }
}