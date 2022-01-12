public void draw(com.mime.minefront.graphics.Render render, int xOffset, int yOffset) {
    for (int y = 0; y < (render.height); y++) {
        int yPix = yOffset;
        for (int x = 0; x < (render.width); x++) {
            int xPix = xOffset;
            pixels[(xPix + (yPix * (width)))] = render.pixels[(x + (render.width))];
        }
    }
}