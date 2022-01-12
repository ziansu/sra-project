public void validateEmptyFirstName() {
    edtFirstName.setError(null);
    if (!(edtFirstName.hasFocus())) {
        return ;
    }
    checkEmptyName = !("".equals(getEditTextText(edtFirstName)));
    if (!(checkEmptyName)) {
        edtFirstName.setError(getResources().getString(R.string.first_name_error));
    }
}