@java.lang.Override
public void focusLost(java.awt.event.FocusEvent e) {
    this.updateState();
    if (this.isEmpty) {
        this.unregisterListeners();
        try {
            this.isGhost = true;
            this.inputBox.setText(this.ghostText);
            this.inputBox.setGhostColor();
        } finally {
            this.registerListeners();
        }
    }
}