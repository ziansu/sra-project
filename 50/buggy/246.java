public void dragCamera(float deltaX, float deltaY) {
    Core.INSTANCE.camera.add((deltaX * (Core.INSTANCE.camera.orthoCam.zoom)), (deltaY * (Core.INSTANCE.camera.orthoCam.zoom)));
    Core.INSTANCE.camera.update();
}