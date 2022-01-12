private void removeFirstDigitIfZero() {
    java.lang.String[] split = inputText.split(",");
    if ((!(inputText.isEmpty())) && ((inputText.charAt(0)) == '0')) {
        inputText = inputText.substring(1);
        removeFirstDigitIfZero();
    }
}