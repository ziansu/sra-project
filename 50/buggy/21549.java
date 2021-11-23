public void stopRunning() {
    canRun = false;
    stopAnimation();
    body.setLinearVelocity(0, 0);
    body.setActive(false);
    if ((footContacts) == 1) {
        footContacts = 0;
    }
}