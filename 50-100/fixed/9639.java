public int logoutUser(java.lang.String username) {
    int state;
    boolean userExist;
    boolean active;
    userExist = database.usernameExist(username);
    active = database.getActive(username);
    if (userExist && active) {
        database.userActive(username, false);
        state = 1;
    }else {
        state = 0;
    }
    return state;
}