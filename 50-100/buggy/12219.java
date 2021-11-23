private boolean isAlreadyMerged(com.google.gerrit.server.git.CodeReviewCommit commit) throws java.io.IOException {
    try (com.google.gerrit.server.git.CodeReviewCommit.CodeReviewRevWalk mirw = com.google.gerrit.server.git.CodeReviewCommit.newRevWalk(rw.getObjectReader())) {
        mirw.reset();
        mirw.markStart(commit);
        for (org.eclipse.jgit.revwalk.RevCommit accepted : alreadyAccepted) {
            if (mirw.isMergedInto(mirw.parseCommit(accepted), mirw.parseCommit(commit))) {
                return true;
            }
        }
    }
    return false;
}