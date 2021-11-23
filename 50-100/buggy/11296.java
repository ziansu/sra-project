public void login(java.lang.String email, java.lang.String password) {
    com.weddingcrashers.model.User user = _userService.getUserByEmail(email);
    com.weddingcrashers.servermodels.LoginContainer loginContainer = new com.weddingcrashers.servermodels.LoginContainer();
    if (user != null) {
        if (user.getPassword().equals(com.weddingcrashers.repositories.Utils.hashPassword(password))) {
            loginContainer.setUser(user);
        }
    }
    com.weddingcrashers.server.ServerUtils.sendObject(client, loginContainer);
}