private java.lang.String getLoginFromUser(java.util.Scanner sc) {
    java.lang.String login = getUserInputRegex(sc, View.INPUT_LOGIN, Regexes.USER_NAME);
    while (allUsers.isLoginOccupied(login)) {
        view.printMessage(View.LOGIN_OCCUPIED);
        login = getUserInputRegex(sc, View.INPUT_LOGIN, Regexes.USER_NAME);
    } 
    return login;
}