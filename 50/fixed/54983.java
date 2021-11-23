public void setEmailInput(java.lang.String email) {
    element(emailInput).waitUntilVisible();
    typeInto(emailInput, email);
}