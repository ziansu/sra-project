@java.lang.Override
public synchronized boolean open() {
    if (isOpen())
        return true;
    
    final boolean open = camera.open(cameraIndex);
    if (open) {
        camera.set(5, 60);
        com.shootoff.camera.CameraFactory.openCamerasAdd(this);
    }
    return open;
}