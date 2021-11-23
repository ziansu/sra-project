public void update(double dt, boolean isRewind) {
    if (((playerInput) != null) && (!isRewind)) {
        playerInput.updatePlayer(this, dt);
        sendInputsToServer();
    }
    updateMovement(dt, isRewind);
    checkCollisions(dt, isRewind);
    updateJumping(dt);
    updateFalling(dt);
    if (!isRewind) {
        updateWalkAnimation(dt);
        sendUpdateFromServerToClients();
        updateFlameThrower(dt);
        updateWeapon(dt);
    }
}