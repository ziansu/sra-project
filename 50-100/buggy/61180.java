public static BusinessLogic.User loginUser(java.lang.String username, java.lang.String password) {
    BusinessLogic.User user = Database.UserDB.getUser(username);
    username = username.toLowerCase();
    if ((username.equals(user.getUsername().toLowerCase())) && (password.equals(user.getPassword())))
        return user;
    else
        return null;
    
}