private javax.swing.JPanel fileOutputPanel() {
    javax.swing.JPanel panel = new javax.swing.JPanel();
    panel.setLayout(new javax.swing.BoxLayout(panel, javax.swing.BoxLayout.X_AXIS));
    outputFilePath.addFocusListener(OUTPUT_FOCUS_LISTENER);
    javax.swing.JButton browseButton = new javax.swing.JButton("Browse For Output File");
    browseButton.setActionCommand("Browse For Output File");
    browseButton.addActionListener(OUTPUT_LISTENER);
    panel.add(outputFilePath);
    panel.add(browseButton);
    return panel;
}