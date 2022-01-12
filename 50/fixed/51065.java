public org.kohsuke.github.GHCommit.ShortInfo getCommitShortInfo() throws java.io.IOException {
    if ((commit) == null)
        populate();
    
    return commit;
}