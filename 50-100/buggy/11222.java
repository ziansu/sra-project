@java.lang.Override
public void dispose() {
    dataset = null;
    displayService.getDisplays().remove(display);
    imageDisplayService.getImageDisplays().remove(display);
    display.clear();
    dataset = null;
    display.close();
    display = null;
    java.lang.System.gc();
}