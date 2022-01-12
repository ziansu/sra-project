public java.awt.Image getImage(java.net.URL url) {
    try {
        java.awt.Image image = super.getImage(url);
        java.awt.MediaTracker tracker = new java.awt.MediaTracker(this);
        tracker.addImage(image, 0);
        tracker.waitForAll();
        if (!(tracker.isErrorAny())) {
            return image;
        }
    } catch (java.lang.Exception e) {
    }
    return null;
}