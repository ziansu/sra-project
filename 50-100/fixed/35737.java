private javax.swing.JPanel createNavigationButtons() {
    javax.swing.JPanel temp1 = new javax.swing.JPanel();
    temp1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER));
    done = new javax.swing.JButton(messages.getString("done"));
    done.addActionListener(this);
    submit = new javax.swing.JButton(messages.getString("submit"));
    submit.addActionListener(this);
    temp1.add(done);
    temp1.add(submit);
    return temp1;
}