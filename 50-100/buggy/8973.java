public void reset() {
    canTouchThis = false;
    try {
        clearLevel();
    } catch (java.lang.NullPointerException a) {
    }
    level = -1;
    nextLevel();
    scor.setScore(0);
    currentGameOver = false;
    if (endiSet) {
        endi.hide();
    }
    if (aset) {
        a.hide();
    }
    canTouchThis = true;
}