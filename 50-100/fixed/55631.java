public void timerBomb(int x, int y, int blastRadius) {
    if ((timerStart) == 0) {
        timerStart = java.lang.System.currentTimeMillis();
    }else {
        timerDif = java.lang.System.currentTimeMillis();
        if (((timerDif) - (timerStart)) > (timerAmount)) {
            explodeBomb(x, y, blastRadius);
            timerStart = 0;
            timerDif = 0;
        }
    }
}