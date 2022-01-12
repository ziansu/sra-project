public void timerBomb(int x, int y, int blastRadius) {
    if ((isExploded) == false) {
        isExploded = true;
        timerStart = java.lang.System.currentTimeMillis();
        explodeBomb(x, y, blastRadius);
    }else {
        timerDif = java.lang.System.currentTimeMillis();
        if ((timerDif) > (timerAmount)) {
            timerStart = 0;
            timerDif = 0;
            isExploded = true;
        }
    }
}