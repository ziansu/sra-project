public void start() {
    if (!(isSingleplayer)) {
        listen();
        openConnection(addressString);
    }
    loading.init();
    slot = -1;
    positionUpdatePoint = new java.awt.Point(0, 0);
    worldEntity = null;
    setLevel(null);
    waitTimer = 0;
    waitAttempts = 0;
    running = true;
}