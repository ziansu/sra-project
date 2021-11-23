@javax.annotation.Nonnull
static argelbargel.jenkins.plugins.gitlab_branch_source.GitLabLinkAction toMergeRequest(org.gitlab.api.models.GitlabProject project, java.lang.String id) {
    return argelbargel.jenkins.plugins.gitlab_branch_source.GitLabLinkAction.create(argelbargel.jenkins.plugins.gitlab_branch_source.Messages.GitLabLink_DisplayName_MergeRequest(), argelbargel.jenkins.plugins.gitlab_branch_source.GitLabSCMIcons.ICON_MERGE_REQUEST, project, ("merge_requests/" + (java.lang.String.valueOf(id))));
}