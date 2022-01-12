public java.util.List<org.gitlab.api.models.GitlabMergeRequest> get(org.gitlab.api.models.GitlabProject project) throws java.io.IOException {
    _requests.add(project);
    final java.util.List<org.gitlab.api.models.GitlabMergeRequest> l = _responses.get(project.getId());
    return l == null ? java.util.Collections.<org.gitlab.api.models.GitlabMergeRequest>emptyList() : l;
}