public void readAndApply() {
    GameDelta gd = readGameDelta();
    if (gd == null)
        return ;
    
    if ((gd.uniqueID) == (-1)) {
        (prevID)++;
        gd.uniqueID = prevID;
        writeGameDelta(gd);
        gamestate.applyGameDelta(gd);
    }else
        gamestate.applyGameDelta(gd);
    
}