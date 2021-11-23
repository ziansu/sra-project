public void mouseWheelMoved(int wheelRotation) {
    com.jwm.j3dfw.production.Camera cam = geo.getCamera();
    cam.setZoom(wheelRotation);
}