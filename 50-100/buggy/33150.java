private boolean validateLogin(com.tw.core.User user) {
    java.lang.String userName = user.getName();
    java.lang.String userPasswordEncrypted = passwordService.encrypt(user.getPassword());
    java.util.List<com.tw.core.User> userList = userService.validateUser(userName, userPasswordEncrypted);
    return userList != null;
}