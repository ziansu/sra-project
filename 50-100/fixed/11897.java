public void update() {
    if (isActive) {
        physicsPositionCalibration();
        paintballShadow.setTranslation(new com.metaio.sdk.jni.Vector3d(geometry.getTranslation().getX(), geometry.getTranslation().getY(), 0.0F));
        if ((getPlayerId()) == (com.google.sprint1.GameState.getState().myPlayerID))
            checkCollisions();
        
        if ((geometry.getTranslation().getZ()) <= 0.0F) {
            disable();
        }
    }
}