private void handlePlayerIsAboveScreenHalfway() {
    edwardwang.bouncingball.PhysicsEngine.Vector3D.Vector3DInt playerPosition = player1Sprite.getPosition();
    if ((playerPosition.getY()) <= (screenHalfwayHeight)) {
        setIsBackgroundUpdated(true);
        if (isBackgroundReadyToUpdate()) {
            setUpdatePlatformSpeed(playerPosition.getY());
            updatePreviousPlatformPositionY();
            fillMissingPlatforms();
            setIsBackgroundUpdated(false);
        }
    }
}