public float getFloat() {
    if (textField.getText().isEmpty()) {
        return 0;
    }
    return java.lang.Float.parseFloat(textField.getText());
}