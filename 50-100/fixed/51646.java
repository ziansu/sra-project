private void setupLayout() {
    getContentPane().setLayout(new java.awt.BorderLayout());
    myPanel = new javax.swing.JTextArea();
    myTextField = new javax.swing.JTextField();
    javax.swing.JScrollPane sp = new javax.swing.JScrollPane(myPanel);
    getContentPane().add(sp, java.awt.BorderLayout.CENTER);
    getContentPane().add(myTextField, java.awt.BorderLayout.SOUTH);
    myTextField.addActionListener(this);
}