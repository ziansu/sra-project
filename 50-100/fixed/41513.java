private void cropText(javax.swing.JTextField textField, int maxLenght) {
    if ((textField.getText().length()) >= maxLenght) {
        java.lang.String text = textField.getText();
        java.lang.String sizedText = text.substring(0, maxLenght);
        textField.setText(sizedText);
    }
}