public void updateSpriteLocationStaticallyX(edwardwang.bouncingball.Sprite.Sprite sprite, edwardwang.bouncingball.PhysicsEngine.Direction direction, long fps) {
    int deltaX = ((int) ((sprite.getPixelDistancePerSecond()) / fps));
    switch (direction) {
        case LEFT :
            deltaX *= -1;
            break;
        case RIGHT :
            break;
    }
    sprite.getRigidBody().getDeltaDistance().setX(deltaX);
    if (isSpriteHitBoxWithinMapConstraints(sprite.getSpriteHitBox())) {
        sprite.updatePosition(Axis.X);
    }
}