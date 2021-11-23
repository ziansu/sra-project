private java.util.List<com.google.gerrit.server.git.CodeReviewCommit> sort(java.util.Collection<com.google.gerrit.server.git.CodeReviewCommit> toSort) throws com.google.gerrit.server.git.IntegrationException {
    try {
        java.util.List<com.google.gerrit.server.git.CodeReviewCommit> result = new com.google.gerrit.server.git.RebaseSorter(args.rw, args.alreadyAccepted, args.canMergeFlag).sort(toSort);
        java.util.Collections.sort(result, CodeReviewCommit.ORDER);
        return result;
    } catch (java.io.IOException e) {
        throw new com.google.gerrit.server.git.IntegrationException("Commit sorting failed", e);
    }
}