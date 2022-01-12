public void setOverlay(java.io.File overlay) {
    if (overlay != null ? !(overlay.equals(this.overlay)) : overlay == null) {
        java.io.File oldOverlay = this.overlay;
        this.overlay = overlay;
        dirty = true;
        propertyChangeSupport.firePropertyChange("overlay", oldOverlay, overlay);
    }
}