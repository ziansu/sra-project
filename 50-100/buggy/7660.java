public void draw(com.badlogic.gdx.graphics.g2d.SpriteBatch batch) {
    batch.draw(cannonTextureRegion, (((xpos) - ((width) / 2.0F)) - 3), (((ypos) - ((height) / 2.0F)) + 23), ((width) / 2.0F), ((height) / 2.0F), width, height, (5 / 2), 1, angle, true);
}