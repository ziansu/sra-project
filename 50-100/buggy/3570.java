private static argelbargel.jenkins.plugins.gitlab_branch_source.GitLabLinkAction create(@javax.annotation.Nonnull
org.gitlab.api.models.GitlabProject project, @javax.annotation.CheckForNull
java.lang.String displayName, @javax.annotation.Nonnull
java.lang.String iconName, java.lang.String path) {
    return new argelbargel.jenkins.plugins.gitlab_branch_source.GitLabLinkAction((displayName == null ? "" : displayName), iconName, (((project.getWebUrl()) + "/") + path));
}