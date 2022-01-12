public static boolean isAdmin(java.lang.String username) throws java.io.IOException {
    if ((session().get("userName")) != null) {
        java.util.ArrayList<java.lang.String> groups = controllers.User.getPerson(username).getGroups();
        if (groups.contains("GROUP_ALFRESCO_ADMINISTRATORS")) {
            return true;
        }
    }
    return false;
}