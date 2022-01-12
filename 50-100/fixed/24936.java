public boolean isGameOver() {
    if ((s1.dead()) || (s2.dead()))
        return true;
    
    if (((getMissilesLeft(0)) <= 0) && ((getMissilesLeft(1)) <= 0)) {
        if (objects.isEmpty()) {
            return true;
        }
    }
    return (currentTick) >= (battle.SimpleBattle.nTicks);
}