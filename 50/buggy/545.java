public void setEnabled(boolean enabled) {
    this.enabled = enabled;
    if (enabled)
        findCBox.requestFocusInWindow();
    else
        if ((frame) != null)
            frame.requestFocus();
        
    
}