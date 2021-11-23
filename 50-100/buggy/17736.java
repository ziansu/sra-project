public void UpdateMultiplayer(int id, int pX, int pY, int sX, int sY) {
    if ((pX < 255) && (pY < 255))
        multiplayerHandler.updatePlayer(id, pX, pY);
    
    if ((sX < 255) && (sY < 255))
        multiplayerHandler.updateSlab(id, sX, sY);
    
}