public void setGameSpeed(int speed) {
    if ((speed > 0) || ((gameSpeed) == 0)) {
        gameSpeed = speed;
        storedGameSpeed = speed;
    }else {
        togglePause();
    }
}