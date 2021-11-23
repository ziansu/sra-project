private void renderPowerButton(com.badlogic.gdx.graphics.g2d.SpriteBatch batch) {
    if (!(worldController.isGameOver())) {
        worldController.powerupButton.render(batch);
    }
}