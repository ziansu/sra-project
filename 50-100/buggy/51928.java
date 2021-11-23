public void validatePassword() {
    edtPassword.setError(null);
    if (edtPassword.hasFocus()) {
        if (!(com.kms.cura.utils.InputUtils.isPasswordValid(getEditTextText(edtPassword)))) {
            checkPass = false;
            edtPassword.setError(getResources().getString(R.string.PasswordError));
        }else {
            checkPass = true;
        }
    }
}