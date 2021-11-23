public boolean readAndApply() {
    GameDelta gd = readGameDelta();
    if (gd == null) {
        return false;
    }
    if ((gd.uniqueID) == (-1)) {
        (prevID)++;
        gd.uniqueID = prevID;
        writeGameDelta(gd);
        gamestate.applyGameDelta(gd);
    }else {
        gamestate.applyGameDelta(gd);
    }
    return true;
}