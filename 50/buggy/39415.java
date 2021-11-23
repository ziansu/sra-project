public void validateUser() {
    businessLogic.controller.RoleAuthenticator roleAuthenticator = new businessLogic.controller.RoleAuthenticator();
    message = roleAuthenticator.validateUser(username, password);
}