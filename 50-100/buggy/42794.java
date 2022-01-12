public void pauseGame(boolean newPause) {
    while ((!(safeToAct)) && (!(paused))) {
        try {
            java.lang.Thread.sleep(5);
        } catch (java.lang.Exception e) {
        }
    } 
    paused = newPause;
    safeToAct = !(paused);
}