public void start() {
    if (!(isSingleplayer)) {
        openConnection(addressString);
        listen();
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