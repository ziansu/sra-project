private void addChangeStatusField() {
    changeStatusField = new javax.swing.JTextField(TEXT_FIELD_SIZE);
    changeStatusField.addActionListener(new ChangeStatusListener(changeStatusField, this));
    add(changeStatusField, WEST);
}