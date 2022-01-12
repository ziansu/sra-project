public final void scaleToScreenSize(final int screenWidth, final int screenHeight) {
    float scaleX = ((float) (screenWidth)) / (defaultScreenSize.x());
    float scaleY = ((float) (screenHeight)) / (defaultScreenSize.y());
    if ((scaleX != 0) && (scaleY != 0)) {
        for (com.badlogic.gdx.graphics.g2d.BitmapFont font : fonts.values()) {
            font.getData().setScale(scaleX, scaleY);
        }
    }
}