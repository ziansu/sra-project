private boolean gitRepoIsClean() {
    try {
        com.orgzly.android.git.Status status = git.status().call();
        return status.hasUncommittedChanges();
    } catch (org.eclipse.jgit.api.errors.GitAPIException e) {
        return false;
    }
}