public float getMapPixelWidth() {
    float mapPixelWidth = ((getMapWidth()) * (getMapTileWidth())) * (levelScale);
    return mapPixelWidth;
}