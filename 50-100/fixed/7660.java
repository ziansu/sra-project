public void draw(com.badlogic.gdx.graphics.g2d.SpriteBatch batch) {
    batch.draw(cannonTextureRegion, ((xpos) - ((width) / 2.0F)), ((ypos) - ((height) / 2.0F)), ((width) / 2.0F), ((height) / 2.0F), width, height, 1, 1, angle, true);
}