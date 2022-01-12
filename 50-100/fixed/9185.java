public void doClose() throws java.lang.InterruptedException {
    java.awt.image.BufferedImage screen;
    java.util.List<java.awt.Point> clickPos;
    log.print("doClose", Log.LOGLEVEL.INFO);
    screen = scr.getScreen();
    for (ClickObject icon : clObj.closes) {
        clickPos = scr.find(screen, icon, false);
        scr.click(clickPos, icon);
    }
}