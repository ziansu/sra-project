public static java.lang.String getLastHash(alien4cloud.git.Git git) {
    try {
        java.util.Iterator<org.eclipse.jgit.revwalk.RevCommit> revCommitIterator = git.log().setMaxCount(1).call().iterator();
        if (revCommitIterator.hasNext()) {
            return revCommitIterator.next().getName();
        }
    } catch (org.eclipse.jgit.api.errors.GitAPIException e) {
        log.error("Failed to log git repository ", e);
        throw new alien4cloud.exception.GitException("Failed to log git repository", e);
    }
    return null;
}