public edu.gatech.cs2340.thericks.models.User getUserByUsername(java.lang.String username) {
    for (edu.gatech.cs2340.thericks.models.User u : users) {
        if (u.getLogin().getUsername().equals(username)) {
            return u;
        }
    }
    return null;
}