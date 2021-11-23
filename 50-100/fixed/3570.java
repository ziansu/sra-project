@javax.annotation.Nonnull
private static argelbargel.jenkins.plugins.gitlab_branch_source.GitLabLinkAction create(@javax.annotation.CheckForNull
java.lang.String displayName, @javax.annotation.Nonnull
java.lang.String iconName, @javax.annotation.Nonnull
org.gitlab.api.models.GitlabProject project, java.lang.String path) {
    return new argelbargel.jenkins.plugins.gitlab_branch_source.GitLabLinkAction((displayName == null ? "" : displayName), iconName, (((project.getWebUrl()) + "/") + path));
}