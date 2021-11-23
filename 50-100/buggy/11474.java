public static javax.swing.JPanel createLabeledTextBox(java.lang.String label) {
    javax.swing.JPanel labeledTextBox = new javax.swing.JPanel();
    javax.swing.JLabel l = new javax.swing.JLabel(label);
    labeledTextBox.add(l);
    javax.swing.JTextField text = new javax.swing.JTextField();
    labeledTextBox.add(text);
    return labeledTextBox;
}