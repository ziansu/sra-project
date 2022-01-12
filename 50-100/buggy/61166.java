public void move(com.badlogic.gdx.math.Vector2 movement) {
    sprite.setPosition(((sprite.getX()) + (movement.x)), ((sprite.getY()) + (movement.y)));
    hitbox.setPosition(sprite.getX(), sprite.getY());
}