public void clickedRight(int x, int y) {
    if ((!(dead)) && (!(finish))) {
        int tileX = x / (Source.World.width);
        int tileY = y / (Source.World.height);
        tiles[tileX][tileY].placeFlag();
    }
    checkFinish();
}