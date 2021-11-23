@java.lang.Override
public void focusGained(java.awt.event.FocusEvent e) {
    this.updateState();
    if (this.isEmpty) {
        this.unregisterListeners();
        try {
            this.isGhost = false;
            this.inputBox.setText("");
            this.inputBox.setSuccessColor();
        } finally {
            this.registerListeners();
        }
    }
}