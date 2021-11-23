public void cmdMouseWheelMoved(int wheelMoved) {
    com.jwm.j3dfw.production.Camera cam = geo.getCamera();
    double angleChange = wheelMoved;
    cam.incrementAngle(angleChange);
}