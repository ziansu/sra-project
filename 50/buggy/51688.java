@java.lang.Override
public void setDisplay(net.imagej.display.ImageDisplay display) {
    this.display = display;
    dataset = imageDisplayService.getActiveDataset(display);
}