public java.lang.String getEncodedGameSave() {
    java.lang.String str = "";
    for (int i = 0; i != (levels.length); i++)
        str += levels[i].getEncodedLevel();
    
    for (int i = 0; i != (players.length); i++)
        str += players[i].getEncodedPlayer();
    
    return str;
}