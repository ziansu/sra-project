public void stopRunning() {
    canRun = false;
    stopAnimation();
    body.setLinearVelocity(0, 0);
}