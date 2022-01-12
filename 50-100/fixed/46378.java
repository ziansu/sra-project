public void run() {
    time.start();
    pxl.transpose();
    time.stop();
    repaint();
    saved = false;
    setTitle(((((Info.NAME) + " - ") + (pxl.getImageName())) + "*"));
}