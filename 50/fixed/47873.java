public void togglePause() {
    if ((gameSpeed) > 0) {
        storedGameSpeed = gameSpeed;
        gameSpeed = 0;
    }else {
        setGameSpeed(storedGameSpeed);
    }
}