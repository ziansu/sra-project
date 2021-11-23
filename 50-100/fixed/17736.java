public void UpdateMultiplayer(int id, int pX, int pY, int sX, int sY) {
    if ((pX != (-1)) && (pY != (-1))) {
        multiplayerHandler.updatePlayer(id, pX, pY);
    }
    if ((sX != (-1)) && (sY != (-1))) {
        multiplayerHandler.updateSlab(id, sX, sY);
    }
}