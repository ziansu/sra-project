public void addSprite(com.badlogic.gdx.graphics.g2d.Sprite sprite, int layer, float offset) {
    com.net.isometric.utils.IsometricTiledMapRendererWithDepth.RenderSprite rSprite = new com.net.isometric.utils.IsometricTiledMapRendererWithDepth.RenderSprite(sprite, layer, offset);
    sprites.add(rSprite);
}