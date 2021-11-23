public void run() {
    time.start();
    pxl.sort(dir, by);
    time.stop();
    repaint();
    saved = false;
    setTitle(((((Info.NAME) + " - ") + (pxl.getImageName())) + "*"));
}