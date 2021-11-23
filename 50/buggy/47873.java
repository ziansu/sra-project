public void togglePause() {
    if ((gameSpeed) > 0) {
        storedGameSpeed = gameSpeed;
        setGameSpeed(0);
    }else {
        setGameSpeed(storedGameSpeed);
    }
}