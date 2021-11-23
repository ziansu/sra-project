public void run() {
    time.start();
    pxl.randomize(value);
    time.stop();
    validate();
    repaint();
    saved = false;
    setTitle(((((Info.NAME) + " - ") + (pxl.getImageName())) + "*"));
}