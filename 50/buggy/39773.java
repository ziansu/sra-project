public boolean isOutOfBounds() {
    return ((Gdx.graphics.getWidth()) < (getPosition().getX())) || ((getPosition().getX()) < 1);
}