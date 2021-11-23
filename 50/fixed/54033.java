public void render(com.badlogic.gdx.graphics.g2d.Batch spriteBatch) {
    spriteBatch.begin();
    shapeRenderSystem.render(spriteBatch);
    spriteRenderSystem.render(spriteBatch);
    textRenderSystem.render(spriteBatch);
    consoleHighlightRenderSystem.render(spriteBatch);
    spriteBatch.end();
}