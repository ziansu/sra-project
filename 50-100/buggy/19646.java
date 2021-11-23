@java.lang.Override
public org.eclipse.jgit.revwalk.RevCommit createStash(org.eclipse.jgit.api.Git git) {
    log.info("Git repo {} has uncommitted changes. Creating a stash");
    org.eclipse.jgit.revwalk.RevCommit revCommit = null;
    try {
        revCommit = git.stashCreate().call();
    } catch (org.eclipse.jgit.api.errors.GitAPIException e) {
        log.error("Error while stashing the changes of {}", git.getRepository());
        e.printStackTrace();
    }
    log.info("Uncommitted changes were successfully stashed");
    return revCommit;
}