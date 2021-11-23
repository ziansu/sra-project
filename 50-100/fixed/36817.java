public void updateSpriteLocationStaticallyX(edwardwang.bouncingball.Sprite.Sprite sprite, edwardwang.bouncingball.PhysicsEngine.Direction direction, long fps) {
    if (isSpriteHitBoxWithinMapConstraints(sprite.getSpriteHitBox())) {
        int deltaX = ((int) ((sprite.getPixelDistancePerSecond()) / fps));
        switch (direction) {
            case LEFT :
                deltaX *= -1;
                break;
            case RIGHT :
                break;
        }
        sprite.getRigidBody().getDeltaDistance().setX(deltaX);
        sprite.updatePosition(Axis.X);
    }
}