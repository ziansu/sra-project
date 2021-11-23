private com.badlogic.gdx.graphics.g2d.BitmapFont getFont(final dc.longshot.game.FontSize size, final com.badlogic.gdx.graphics.Color color) {
    com.badlogic.gdx.graphics.g2d.BitmapFont font = fonts.get(size);
    font.setColor(color);
    return font;
}