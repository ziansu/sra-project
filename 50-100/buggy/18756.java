public void doRegisterUser(java.lang.String username, java.lang.String password) {
    if (doesUserExist(username)) {
        loginView.showErrorMessageIfUsernameTaken();
        return ;
    }
    personal.jjbillings.expensetracker.User newUser = new personal.jjbillings.expensetracker.User(0, username, password);
    mDBHelper.addUser(newUser);
    loginView.showConfirmationForRegistration();
}