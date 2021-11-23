public void render(com.wolf.engine.core.media.SpriteSheet spriteSheet, int startX, int startY, int endX, int endY, int offsetX, int offsetY) {
    for (int x = startX; x < endX; x++) {
        for (int y = startY; y < endY; y++) {
            setPixel(((x + offsetX) - startX), ((y + offsetY) - startY), spriteSheet.pixels[(x + (y * (spriteSheet.width)))]);
        }
    }
}