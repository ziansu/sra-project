private boolean isEmailValid(java.lang.String email) {
    java.lang.System.out.print(email);
    return (accMan.getAccount(email)) != null;
}