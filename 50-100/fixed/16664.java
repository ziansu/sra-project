public boolean setImage(java.awt.image.BufferedImage image, java.lang.String text, org.delafer.xanderView.gui.config.OrientationStore.ImageData imgData) {
    this.imageSource = image;
    this.text = text;
    this.orientationDefault = getDirectionDefault();
    this.orientation = net.j7.commons.base.CommonUtils.nvl(imgData.getOrientation(), orientationDefault);
    this.scaleIdx = imgData.getScaleConst();
    return preRenderImage();
}