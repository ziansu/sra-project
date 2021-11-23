@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    if (!(s.equals(passwordEditText.getText()))) {
        confirmPasswordEditText.setError("Passwords don't match");
    }
}