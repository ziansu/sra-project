private void restoreSelection(int location, int oldLenght, boolean moveCursor) {
    int newLength = textInputField.getText().length();
    int deltaLength = newLength - oldLenght;
    if (moveCursor) {
        location = location + deltaLength;
    }
    location = java.lang.Math.min(location, (newLength - 1));
    location = java.lang.Math.max(0, location);
    textInputField.setSelection(location, location);
}