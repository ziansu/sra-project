public boolean checkWaterHit(frogger.Player frog) {
    int frogY = frog.getY();
    if ((frogY < ((GameTools.numWaterSquares) * (GameTools.rowHeight))) && (((java.lang.System.currentTimeMillis()) - (lastLogHitTimer)) > 100))
        return true;
    
    return false;
}