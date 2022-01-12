private void textFieldCreateAndChecker(javax.swing.JTextField textField) {
    textField = new javax.swing.JTextField("2", 5);
    textField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    textField.setFont(font(25));
    textField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    size = textField.getPreferredSize();
    textField.setBounds((550 + (insets.left)), (250 + (insets.top)), size.width, size.height);
    add(textField);
}