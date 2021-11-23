public void updateSelection(java.lang.String selection) {
    java.util.Enumeration<javax.swing.AbstractButton> buttons = btns.getElements();
    while (buttons.hasMoreElements()) {
        javax.swing.JToggleButton b = ((javax.swing.JToggleButton) (buttons.nextElement()));
        if (b.getActionCommand().equals(selection)) {
            btns.clearSelection();
            b.setSelected(true);
            break;
        }
    } 
}