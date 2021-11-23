public boolean knowMap(int tileX, int tileY) {
    int mapX = tileX / 4;
    int mapY = tileY / 4;
    int index = mapX + (mapY * ((playerMob.getLevel().width) / 4));
    if (index >= (mapLoaded.length))
        return false;
    
    return mapLoaded[index];
}