private boolean isUpdated(org.kohsuke.github.GHPullRequest pr) {
    boolean ret = (updated.compareTo(pr.getUpdatedAt())) < 0;
    ret = ret || (!(pr.getHead().getSha().equals(head)));
    return ret;
}