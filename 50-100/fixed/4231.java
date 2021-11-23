@java.lang.Override
public boolean addFriend(User user, java.lang.String friendUsername) {
    boolean valid = true;
    for (int i = 0; i < (registeredUsers.size()); i++) {
        if (!(registeredUsers.get(i).equals(friendUsername))) {
            valid = false;
        }
    }
    if (valid) {
        user.addFriend(friendUsername);
    }
    return valid;
}