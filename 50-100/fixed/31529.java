private void drawText(java.lang.String text, int posX, int posY, float scale) {
    font.setColor(1.0F, 1.0F, 1.0F, 1.0F);
    com.badlogic.gdx.graphics.g2d.Batch batch = stage.getBatch();
    batch.begin();
    font.draw(batch, text, posX, posY);
    batch.end();
}