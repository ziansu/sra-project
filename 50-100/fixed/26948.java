public void run() {
    time.start();
    pxl.randomize(value);
    time.stop();
    repaint();
    saved = false;
    setTitle(((((Info.NAME) + " - ") + (pxl.getImageName())) + "*"));
}