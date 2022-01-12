public void updateResultOverlay() {
    ij.process.ImageProcessor overlay = classifiedImage.getImageStack().getProcessor(displayImage.getCurrentSlice()).duplicate();
    overlay = overlay.convertToByte(false);
    overlay.setColorModel(overlayLUT);
    new ij.ImagePlus("overlay", overlay).show();
    resultOverlay.setImage(overlay);
    displayImage.updateAndDraw();
}