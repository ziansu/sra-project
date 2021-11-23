public void moveRight(float deltaTime) {
    if (hasLandedFirsTime) {
        livingState = LivingState.MOVING_RIGHT;
        this.oldX = this.getPosition().getX();
        setNewX(deltaTime, getVelocityX());
        lastTimeMoved = java.lang.System.currentTimeMillis();
        lastMovedDirection = LAST_MOVE_RIGHT;
        facingDirection = LivingState.FACING_RIGHT;
    }
}