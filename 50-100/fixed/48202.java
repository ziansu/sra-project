private javax.swing.JPanel fileInputPanel() {
    javax.swing.JPanel panel = new javax.swing.JPanel();
    javax.swing.BoxLayout layout = new javax.swing.BoxLayout(panel, javax.swing.BoxLayout.X_AXIS);
    panel.setLayout(layout);
    javax.swing.JButton browseButton = new javax.swing.JButton(" Browse For Input File ");
    browseButton.setActionCommand("Browse For Input File");
    browseButton.addActionListener(INPUT_LISTENER);
    inputFilePath.addFocusListener(INPUT_FOCUS_LISTENER);
    panel.add(inputFilePath);
    panel.add(browseButton);
    return panel;
}