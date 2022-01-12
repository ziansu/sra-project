public void doRegisterUser(java.lang.String username, java.lang.String password) {
    personal.jjbillings.expensetracker.User newUser = new personal.jjbillings.expensetracker.User(0, username, password);
    if (doesUserExist(newUser)) {
        loginView.showErrorMessageIfUsernameTaken();
        return ;
    }
    mDBHelper.addUser(newUser);
    loginView.showConfirmationForRegistration();
}