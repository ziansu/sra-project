public java.lang.Boolean checkForm() {
    java.lang.Boolean goodEmail;
    java.lang.Boolean goodPassword;
    java.lang.Boolean completeForm;
    goodEmail = checkMatchGeneric(R.id.email, R.id.email2, R.id.tv_email, R.id.tv_email2);
    goodPassword = checkMatchGeneric(R.id.password, R.id.password2, R.id.tv_password, R.id.tv_password2);
    completeForm = checkEmptyFields();
    return (goodEmail && goodPassword) && completeForm;
}