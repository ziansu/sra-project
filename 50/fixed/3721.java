public void mouseWheelMoved(int wheelRotation) {
    com.jwm.j3dfw.production.Camera cam = geo.getCamera();
    if (cam == null) {
        return ;
    }
    cam.setZoom(wheelRotation);
}