public void addUser(java.lang.String name, java.lang.String nickName) {
    final boolean validInputs = codeu.chat.client.ClientUser.isValidName(name);
    final codeu.chat.common.User user = (validInputs) ? controller.newUser(name) : null;
    if (user == null) {
        java.lang.System.out.format("Error: user not created - %s.\n", (validInputs ? "server failure" : "bad input value"));
    }else {
        codeu.chat.client.ClientUser.LOG.info("New user complete, Name= \"%s\" UUID=%s", user.name, user.id);
        user.alias = nickName;
        updateUsers();
    }
}