private java.lang.Object getRating(javax.swing.ButtonGroup buttonGroup) {
    java.lang.String s = null;
    for (java.util.Enumeration<javax.swing.AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
        javax.swing.AbstractButton button = buttons.nextElement();
        if (button.isSelected()) {
            s = button.getText();
            break;
        }
    }
    return s.equals("N/A") ? null : java.lang.Integer.parseInt(s);
}