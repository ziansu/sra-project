public void validatePasswordReenter() {
    if (!(edtPasswordReenter.hasFocus())) {
        return ;
    }
    checkPassReenter = getEditTextText(edtPasswordReenter).equals(getEditTextText(edtPassword));
    if (!(checkPassReenter)) {
        edtPasswordReenter.setError(getResources().getString(R.string.PasswordReenterError));
    }else {
        edtPasswordReenter.setError(null);
    }
}