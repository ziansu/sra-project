public void moveLeft(float deltaTime) {
    if (hasLandedFirsTime) {
        lastMovedDirection = LAST_MOVE_LEFT;
        this.oldX = this.getPosition().getX();
        setNewX(deltaTime, getVelocityX());
        lastTimeMoved = java.lang.System.currentTimeMillis();
        if (!(hasMovedFirstTime)) {
            propertyChangeSupport.firePropertyChange("moveLeft", null, null);
            hasMovedFirstTime = true;
        }
    }
}