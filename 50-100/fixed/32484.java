private javax.swing.JTextField buildComparingField() {
    javax.swing.JTextField field = new javax.swing.JTextField();
    field.setEditable(false);
    field.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.JTextField().getBorder(), new javax.swing.border.EmptyBorder(3, 3, 3, 3)));
    java.awt.Font font = new java.awt.Font("Arial", java.awt.Font.BOLD, 35);
    field.setFont(font);
    field.setForeground(java.awt.Color.BLACK);
    return field;
}