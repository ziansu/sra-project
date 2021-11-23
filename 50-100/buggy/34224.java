public void draw(com.badlogic.gdx.graphics.g2d.Batch batch) {
    currentAnimation.draw(batch, ((position.getX()) + ((currentAnimation.getSpriteWidth()) / 2)), ((position.getY()) + ((currentAnimation.getSpriteHeight()) / 2)), timeSinceAnimationStart);
}