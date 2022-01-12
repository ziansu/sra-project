public void run() {
    time.start();
    pxl.transpose();
    time.stop();
    validate();
    repaint();
    saved = false;
    setTitle(((((Info.NAME) + " - ") + (pxl.getImageName())) + "*"));
}