private void handleSteering(final float velocity) {
    if (this.isButtonNewlyPressed(inputdevice.Input.getButton(leftButton), leftButton)) {
        getGameObject().transform.rotateLeft(90);
        addWallSegment();
    }
    if (this.isButtonNewlyPressed(inputdevice.Input.getButton(rightButton), rightButton)) {
        getGameObject().transform.rotateRight(90);
        addWallSegment();
    }
    getGameObject().transform.translateForward(velocity);
    updateWallSegments();
}