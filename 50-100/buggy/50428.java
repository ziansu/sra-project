public void createCommon() {
    java.lang.String name = view.GUI.inputStr("Name: ");
    java.lang.String login = view.GUI.inputStr("Login: ");
    java.lang.String password = view.GUI.inputStr("Password: ");
    for (int i = 0; i < (users.length); i++) {
        if ((users[i]) == null) {
            users[i] = new model.CommonUser(name, login, password);
        }
    }
}