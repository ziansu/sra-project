@java.lang.Override
public boolean userExists(java.lang.String user) {
    boolean userExists = false;
    for (int i = 0; i < (userInfo.size()); i++) {
        if (user == (userInfo.get(i).username)) {
            userExists = true;
            break;
        }
    }
    return userExists;
}