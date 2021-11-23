public void update() {
    if (((sprite) != null) && ((body) != null))
        sprite.setPosition(((body.getPosition().x) - ((sprite.getWidth()) / 2)), ((body.getPosition().y) - ((sprite.getHeight()) / 2)));
    
}