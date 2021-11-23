@java.lang.Override
public void dispose() {
    assetManager.dispose();
    for (java.util.Map.Entry<java.lang.String, com.badlogic.gdx.graphics.g2d.BitmapFont> font : fonts.entrySet()) {
        fonts.get(font.getKey()).dispose();
    }
}