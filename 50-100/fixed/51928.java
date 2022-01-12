public void validatePassword() {
    edtPassword.setError(null);
    if (!(edtPassword.hasFocus())) {
        return ;
    }
    checkPass = com.kms.cura.utils.InputUtils.isPasswordValid(getEditTextText(edtPassword));
    if (!(checkPass)) {
        edtPassword.setError(getResources().getString(R.string.PasswordError));
    }
}