@java.lang.Override
public void focusLost(java.awt.event.FocusEvent arg0) {
    if (getText().isEmpty()) {
        reset(false);
    }
}