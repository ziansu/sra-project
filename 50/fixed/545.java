public void setEnabled(boolean enabled) {
    this.enabled = enabled;
    if (enabled)
        findCBox.requestFocusInWindow();
    
}