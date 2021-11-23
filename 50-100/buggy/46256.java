public void update() {
    if (((sprite) != null) && ((body) != null))
        sprite.setPosition((((body.getPosition().x) * (MainGameClass.PPM)) - ((sprite.getWidth()) / 2)), (((body.getPosition().y) * (MainGameClass.PPM)) - ((sprite.getHeight()) / 2)));
    
}