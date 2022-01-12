private javax.swing.JTextField createText(java.lang.String text, int width, int height, boolean editable) {
    javax.swing.JTextField textfield = new javax.swing.JTextField(text);
    textfield.setEditable(editable);
    if (!editable) {
        textfield.setBackground(null);
    }
    gui.GUI.setfinalSize(textfield, new java.awt.Dimension(width, height));
    return textfield;
}