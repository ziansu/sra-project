public java.lang.String getEncodedGameSave() {
    java.lang.String str = "";
    for (int i = 0; i != (levels.length); i++)
        str += levels[0].getEncodedLevel();
    
    for (int i = 0; i != (players.length); i++)
        str += players[0].getEncodedPlayer();
    
    return str;
}