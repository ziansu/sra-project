public com.badlogic.gdx.graphics.g2d.BitmapFont loadBitmapFont(java.lang.String fntFile, java.lang.String pngFile) {
    return new com.badlogic.gdx.graphics.g2d.BitmapFont(Gdx.files.internal(relativeResource(fntFile)), Gdx.files.internal(relativeResource(pngFile)), false);
}