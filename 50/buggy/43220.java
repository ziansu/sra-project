void appendError(java.lang.String str) {
    error.append((str + "\n"));
    error.setCaretPosition(((error.getText().length()) - 1));
}