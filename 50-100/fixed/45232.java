public void removeSprite(com.badlogic.gdx.graphics.g2d.Sprite sprite) {
    java.util.Iterator<com.net.isometric.utils.IsometricTiledMapRendererWithDepth.RenderSprite> it = sprites.iterator();
    while (it.hasNext()) {
        com.net.isometric.utils.IsometricTiledMapRendererWithDepth.RenderSprite rs = it.next();
        if (rs.sprite.equals(sprite)) {
            it.remove();
            return ;
        }
    } 
}