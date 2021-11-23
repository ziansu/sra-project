public void handleBtnNumber0() {
    if (inputValue.addDot("0").equals(".")) {
        cashLabel.setText(inputValue.toString());
    }else {
        appendNumberToInput("0");
    }
}