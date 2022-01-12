public static boolean isAdmin(java.lang.String username) throws controllers.IOException {
    if ((session().get("userName")) != null) {
        controllers.ArrayList<java.lang.String> groups = controllers.User.getPerson(username).getGroups();
        if (groups.contains("GROUP_ALFRESCO_ADMINISTRATORS")) {
            return true;
        }
    }
    return false;
}