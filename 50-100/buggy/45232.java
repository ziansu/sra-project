public void removeSprite(com.badlogic.gdx.graphics.g2d.Sprite sprite, int layer) {
    java.util.Collection<com.net.isometric.utils.IsometricTiledMapRendererWithDepth.RenderSprite> spr = sprites.get(layer);
    java.util.Iterator<com.net.isometric.utils.IsometricTiledMapRendererWithDepth.RenderSprite> it = spr.iterator();
    while (it.hasNext()) {
        com.net.isometric.utils.IsometricTiledMapRendererWithDepth.RenderSprite rs = it.next();
        if (rs.sprite.equals(sprite)) {
            it.remove();
        }
    } 
}