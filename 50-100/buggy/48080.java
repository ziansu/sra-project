protected void checkCollisions() {
    java.util.ArrayList<com.critters.spaceinvaders.entities.Collidable> collidables = level.getCollidables();
    for (com.critters.spaceinvaders.entities.Collidable c : collidables) {
        if (((c.getRectangle().intersectsRect(this.rectangle)) && (c != (owner))) && (c != (this))) {
            c.hit(this);
            level.removeEntity(this);
        }
    }
}