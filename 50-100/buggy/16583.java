public void setActive(java.lang.String viewId) {
    if ((active) != null) {
        active.setEnabled(true);
    }
    active = nameToButton.get(viewId);
    if ((active) != null) {
        active.setEnabled(false);
    }
}