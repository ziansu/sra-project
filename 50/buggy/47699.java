public void focusGained(java.awt.event.FocusEvent e) {
    if (((e.getSource()) == (workingPane)) && (isFirstPush)) {
        workingPane.setText("");
    }
}