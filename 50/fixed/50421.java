public org.gitlab.api.models.GitlabGroup newGroup(java.lang.String name) {
    org.gitlab.api.models.GitlabGroup group = userConn.createGroup(name);
    return group;
}