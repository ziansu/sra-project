private void saveNum1AndUpdateText() {
    inputText = inputText.replace(",", ".");
    num1 = java.lang.Double.parseDouble(inputText);
    inputText = inputText.replace(".", ",");
    storedOperands = (((decimalFormat.format(num1)) + " ") + (action)).replace('.', ',');
    textFieldInput.setText(storedOperands);
    inputText = "";
    textFieldResults.setText(inputText);
}