private void update(javax.swing.event.DocumentEvent e) {
    layers.get(currentLayer()).name = nameField.getText();
    repaint();
}