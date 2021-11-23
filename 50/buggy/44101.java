public void mousePressed() {
    if (ketaiCamera.isStarted()) {
        ketaiCamera.savePhoto();
        ketaiCamera.stop();
    }else {
        ketaiCamera.start();
    }
}