@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o) {
        return true;
    }
    if ((o == null) || ((getClass()) != (o.getClass()))) {
        return false;
    }
    com.capitalone.dashboard.model.GitHubRepo gitHubRepo = ((com.capitalone.dashboard.model.GitHubRepo) (o));
    return (getRepoUrl().equals(gitHubRepo.getRepoUrl())) && (getBranch().equals(gitHubRepo.getBranch()));
}