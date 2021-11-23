public void afterTextChanged(android.text.Editable editable) {
    switch (view.getId()) {
        case R.id.input_namer :
            validateName();
            break;
        case R.id.input_emailr :
            validateEmail();
            break;
        case R.id.input_phoner :
            validatePhone();
            break;
        case R.id.input_passwordr :
            validatePassword();
            break;
    }
}