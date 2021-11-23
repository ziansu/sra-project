public int findUser(java.lang.String userName) {
    java.util.List<org.gitlab.api.models.GitlabUser> users;
    users = userConn.getUsers();
    for (org.gitlab.api.models.GitlabUser user : users) {
        if (user.getUsername().equals(userName)) {
            return user.getId();
        }
    }
    return -1;
}