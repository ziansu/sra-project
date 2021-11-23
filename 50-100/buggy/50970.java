private void createGUI(java.lang.String labelInfo) {
    setMinimumSize(new java.awt.Dimension(200, 200));
    setResizable(false);
    javax.swing.JLabel label = new javax.swing.JLabel(labelInfo);
    javax.swing.JButton closeButton = new javax.swing.JButton("close");
    label.setAlignmentX(javax.swing.JLabel.CENTER_ALIGNMENT);
    label.setAlignmentY(javax.swing.JLabel.CENTER_ALIGNMENT);
    add(label);
    add(closeButton);
    closeButton.addActionListener((java.awt.event.ActionEvent e) -> {
        dispose();
    });
    pack();
    setVisible(true);
}