public crosstheborder.lib.interfaces.Camera getCamera(java.awt.Point center, int tileWidth, int cameraWidth, int cameraHeight) {
    return new crosstheborder.lib.CameraImpl(center, tileWidth, cameraWidth, cameraHeight, tiles);
}