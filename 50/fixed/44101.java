public void mousePressed() {
    if (ketaiCamera.isStarted()) {
        ketaiCamera.stop();
    }else {
        ketaiCamera.start();
    }
}