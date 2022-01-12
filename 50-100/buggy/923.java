public void validatePasswordReenter() {
    edtPasswordReenter.setError(null);
    if (edtPasswordReenter.hasFocus()) {
        if (!(getEditTextText(edtPasswordReenter).equals(getEditTextText(edtPassword)))) {
            checkPassReenter = false;
            edtPasswordReenter.setError(getResources().getString(R.string.PasswordReenterError));
        }else {
            checkPassReenter = true;
        }
    }
}