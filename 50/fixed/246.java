public void dragCamera(float deltaX, float deltaY) {
    Core.INSTANCE.camera.add(deltaX, deltaY);
    Core.INSTANCE.camera.update();
}