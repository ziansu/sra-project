public void setValue(T value) {
    this.value = value;
    textField.setText(value.toString());
}