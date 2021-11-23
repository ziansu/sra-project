public int findUser(java.lang.String name) {
    java.util.List<org.gitlab.api.models.GitlabUser> users;
    users = userConn.getUsers();
    for (org.gitlab.api.models.GitlabUser user : users) {
        if (user.getName().equals(name)) {
            return user.getId();
        }
    }
    return -1;
}