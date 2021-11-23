public void displayScaled(java.lang.String source, float alpha, float scaling) {
    org.myrobotlab.image.DisplayedImage image = new org.myrobotlab.image.DisplayedImage(source, 1, scaling);
    org.myrobotlab.service.ImageDisplay.log.info("Loading image done");
    buildFrame(image);
}