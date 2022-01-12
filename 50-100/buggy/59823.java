@java.lang.Override
public void updateUser(@org.jetbrains.annotations.NotNull
java.lang.String sessionID, @org.jetbrains.annotations.NotNull
rest.UserProfile user) {
    if (isLoggedIn(sessionID)) {
        final rest.UserProfile profile = getUserBySessionID(sessionID);
        if (profile != null) {
            updateUser(profile.getId(), user);
            loggedUsers.put(sessionID, user);
        }
    }
}