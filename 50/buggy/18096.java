private boolean isEmailValid(java.lang.String email) {
    return (accMan.getAccount(email)) != null;
}