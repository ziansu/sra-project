public void run() {
    time.start();
    pxl.sort(dir, by);
    time.stop();
    validate();
    repaint();
    saved = false;
    setTitle(((((Info.NAME) + " - ") + (pxl.getImageName())) + "*"));
}