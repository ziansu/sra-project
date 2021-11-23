public java.awt.Image get(int index, int tileSize) {
    int tilesPerCol = (dim.height) / tileSize;
    int tilesPerRow = (dim.width) / tileSize;
    int x = (index % tilesPerRow) * tileSize;
    int y = (index / tilesPerCol) * tileSize;
    java.awt.image.BufferedImage subimage = caffeine.view.Spritesheet.sheet.getSubimage(x, y, tileSize, tileSize);
    java.awt.Image sprite = caffeine.view.Spritesheet.transformBlackToTransparency(subimage);
    return sprite;
}