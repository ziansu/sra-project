public void showMe(java.lang.String a) {
    textArea = new javax.swing.JTextArea();
    frame = new javax.swing.JFrame(b);
    frame.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
    frame.setLayout(new java.awt.BorderLayout());
    textArea.setText(a);
    javax.swing.JScrollPane scrolltxt = new javax.swing.JScrollPane(textArea);
    frame.add(scrolltxt, java.awt.BorderLayout.CENTER);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
}