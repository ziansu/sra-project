private void removeFirstDigitIfZero() {
    if (((!(inputText.isEmpty())) && ((inputText.charAt(0)) == '0')) && (!(inputText.contains(",")))) {
        inputText = inputText.substring(1);
        removeFirstDigitIfZero();
    }
}