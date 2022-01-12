@java.lang.Override
public void setDisplay(net.imagej.display.ImageDisplay display) {
    dataset = imageDisplayService.getActiveDataset(display);
}