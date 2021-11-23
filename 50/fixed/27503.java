public void addapplet(processing.core.PApplet tem) {
    mainapplet.stop();
    remove(mainapplet);
    tem.init();
    tem.start();
    tem.setVisible(true);
    add(tem);
}