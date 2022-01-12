public void validateEmail() {
    if (!(edtEmail.hasFocus())) {
        return ;
    }
    checkEmail = com.kms.cura.utils.InputUtils.isEmailValid(getEditTextText(edtEmail));
    if (!(checkEmail)) {
        edtEmail.setError(getResources().getString(R.string.EmailError));
    }else {
        edtEmail.setError(null);
    }
}