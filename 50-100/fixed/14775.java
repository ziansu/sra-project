@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (!hasFocus) {
        if (password.getText().toString().isEmpty()) {
            tilPass.setError(getString(R.string.password_blank));
            signIn.setClickable(false);
        }else {
            tilPass.setErrorEnabled(false);
            signIn.setClickable(true);
        }
    }
}