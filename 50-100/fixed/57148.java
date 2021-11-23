private void SetText(java.lang.String newText) {
    if ((edit) != null) {
        int cursorPos = edit.getSelectionStart();
        int previousLength = edit.getText().length();
        edit.setText(newText);
        if (previousLength == cursorPos) {
            cursorPos = newText.length();
        }
        if (cursorPos > (newText.length())) {
            cursorPos = newText.length();
        }
        edit.setSelection(cursorPos);
    }
}