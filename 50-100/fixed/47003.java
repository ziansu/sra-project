public java.awt.Image getImage(java.net.URL url) {
    try {
        java.awt.MediaTracker tracker = new java.awt.MediaTracker(this);
        java.awt.Image image = super.getImage(url);
        tracker.addImage(image, 0);
        tracker.waitForAll();
        if (!(tracker.isErrorAny())) {
            return image;
        }
    } catch (java.lang.Exception e) {
    }
    return null;
}