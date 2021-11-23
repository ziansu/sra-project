public static javax.swing.JPanel createLabeledTextBox(java.lang.String label, int length) {
    javax.swing.JPanel labeledTextBox = new javax.swing.JPanel();
    javax.swing.JLabel l = new javax.swing.JLabel(label);
    labeledTextBox.add(l);
    javax.swing.JTextField text = new javax.swing.JTextField(length);
    labeledTextBox.add(text);
    return labeledTextBox;
}