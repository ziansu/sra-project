public static boolean isValidUserName(java.lang.String userName) {
    return (games.strategy.engine.lobby.server.userDB.DbUser.userNameValidation(userName)) != null;
}