public void draw() {
    update();
    spriteBatch.begin();
    if (returnButton.isVisible()) {
        returnButton.draw(spriteBatch, 1);
    }
    if (startWaveButton.isVisible()) {
        startWaveButton.draw(spriteBatch, 1);
    }
    spriteBatch.end();
}