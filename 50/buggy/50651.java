public void setValue(double multiplierValue) {
    java.lang.String formattedValue = getFormattedValue(multiplierValue);
    this.value.setText(formattedValue);
}