public void setActive(java.lang.String viewId) {
    if ((this.active) != null) {
        this.active.setEnabled(true);
    }
    this.active = this.nameToButton.get(viewId);
    if ((this.active) != null) {
        this.active.setEnabled(false);
    }
}