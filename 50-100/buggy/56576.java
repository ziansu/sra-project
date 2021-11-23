public void validatePasswordReenter() {
    edtPasswordReenter.setError(null);
    if (!(edtPasswordReenter.hasFocus())) {
        return ;
    }
    checkPassReenter = getEditTextText(edtPasswordReenter).equals(getEditTextText(edtPassword));
    if (!(checkPassReenter)) {
        edtPasswordReenter.setError(getResources().getString(R.string.PasswordReenterError));
    }
}