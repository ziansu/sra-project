@java.lang.Override
protected void update(float elapsedTimeMS) {
    graphicslib3D.Point3D cameraLocation = camera1.getLocation();
    graphicslib3D.Matrix3D cameraTranslation = new graphicslib3D.Matrix3D();
    cameraTranslation.translate(cameraLocation.getX(), cameraLocation.getY(), cameraLocation.getZ());
    skyBox.setLocalTranslation(cameraTranslation);
    if ((thisClient) != null) {
        thisClient.processPackets();
    }
    camera1Controller.update(elapsedTimeMS);
    super.update(elapsedTimeMS);
}