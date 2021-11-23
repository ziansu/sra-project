private void addButtonToControlPanel(javax.swing.JButton button, java.lang.String message, java.lang.String label) {
    button = new javax.swing.JButton(label);
    button.setActionCommand(message);
    button.addActionListener(this);
    controlPanel.add(button);
}