public boolean destroyGame(int gameID) {
    if ((gameList[gameID]) == null)
        return false;
    
    gameList[gameID].stop();
    gameList[gameID] = null;
    return true;
}