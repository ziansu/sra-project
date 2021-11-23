private void scaleAndComputePrefSize() {
    com.badlogic.gdx.graphics.g2d.BitmapFont font = cache.getFont();
    float oldScaleX = font.getScaleX();
    float oldScaleY = font.getScaleY();
    if (((fontScaleX) != oldScaleX) || ((fontScaleY) != oldScaleY))
        font.getData().setScale(fontScaleX, fontScaleY);
    
    computePrefSize();
    if (((fontScaleX) != oldScaleX) || ((fontScaleY) != oldScaleY))
        font.getData().setScale(oldScaleX, oldScaleY);
    
}