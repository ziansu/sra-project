public boolean addUserFromData(java.lang.String username, java.lang.String password, edu.gatech.cs2340.thericks.models.Privilege privilege) {
    for (edu.gatech.cs2340.thericks.models.User u : users) {
        if (u.getLogin().getUsername().equals(username)) {
            return false;
        }
    }
    edu.gatech.cs2340.thericks.models.User newUser = new edu.gatech.cs2340.thericks.models.User(username, password, privilege);
    return addUser(newUser);
}