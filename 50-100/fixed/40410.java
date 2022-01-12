private void decrementAttributeValue(javax.swing.JLabel label, javax.swing.JLabel attributeLabel) {
    int currentValue = java.lang.Integer.parseInt(label.getText());
    int newValue = currentValue - 1;
    label.setText(java.lang.Integer.toString(newValue));
    (attributePoints)++;
    attributeLabel.setText(java.lang.Integer.toString(attributePoints));
    if ((attributePoints) > 0) {
        for (javax.swing.JButton plusButton : plusButtons) {
            plusButton.setEnabled(true);
        }
    }
    handleMinMaxValues();
}