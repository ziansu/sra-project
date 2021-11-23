private void createGUI(java.lang.String labelInfo) {
    setMinimumSize(new java.awt.Dimension(200, 200));
    setResizable(false);
    javax.swing.JLabel label = new javax.swing.JLabel(labelInfo);
    label.setAlignmentX(javax.swing.JLabel.CENTER_ALIGNMENT);
    label.setAlignmentY(javax.swing.JLabel.CENTER_ALIGNMENT);
    add(label);
    pack();
    setVisible(true);
}