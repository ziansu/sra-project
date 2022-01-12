private javax.swing.JPanel fileOutputPanel() {
    javax.swing.JPanel panel = new javax.swing.JPanel();
    javax.swing.BoxLayout layout = new javax.swing.BoxLayout(panel, javax.swing.BoxLayout.X_AXIS);
    panel.setLayout(layout);
    javax.swing.JButton browseButton = new javax.swing.JButton("Browse For Output File");
    browseButton.setActionCommand("Browse For Output File");
    browseButton.addActionListener(OUTPUT_LISTENER);
    outputFilePath.addFocusListener(OUTPUT_FOCUS_LISTENER);
    panel.add(outputFilePath);
    panel.add(browseButton);
    return panel;
}