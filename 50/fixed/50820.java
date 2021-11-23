private boolean isEmptyTextFieldInteger(java.lang.String textFieldInput) {
    if (textFieldInput.equals("")) {
        return true;
    }else {
        return !(isInteger(textFieldInput));
    }
}