public boolean hasPermission(java.lang.String permission) {
    dk.fambagge.recipes.domain.User loggedInUser = getLoggedInUser();
    if (loggedInUser == null) {
        return false;
    }
    return loggedInUser.hasPermission(permission);
}