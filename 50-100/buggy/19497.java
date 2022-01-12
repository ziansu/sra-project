@java.lang.Override
public void focusGained(java.awt.event.FocusEvent e) {
    this.updateState();
    if ((this.isEmpty) || (this.isGhost)) {
        this.unregisterListeners();
        try {
            this.inputBox.setText("");
            this.isGhost = false;
            this.inputBox.setSuccessColor();
        } finally {
            this.registerListeners();
        }
    }
}