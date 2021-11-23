public void draw(com.badlogic.gdx.graphics.g2d.SpriteBatch spriteBatch) {
    elapsedTime += Gdx.graphics.getDeltaTime();
    spriteBatch.draw(birdAnim.getKeyFrame(elapsedTime, animated), birdPos.x, birdPos.y, ((getWidth()) / 2), ((getHeight()) / 2), getWidth(), getHeight(), 1, 1, (((verticalSpeed) * 10) * 2));
}