public boolean addUserProfile(UserProfile up) {
    boolean repeat = true;
    java.lang.String userName = up.getUserName();
    while (repeat) {
        repeat = false;
        for (int x = 0; x < (profiles.size()); x++) {
            if (userName.equals(profiles.get(x).getUserName())) {
                return false;
            }
        }
    } 
    profiles.add(up);
    logInUser(up.getUserName());
    return true;
}