public boolean canSetTile(int x, int y, int layer) {
    if (!(isInBounds(x, y, layer)))
        return false;
    
    if (layer == 0)
        return true;
    
    int bottom = getTileID(x, y, (layer - 1));
    return canBuildOn(bottom);
}