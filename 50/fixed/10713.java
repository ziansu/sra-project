private com.orgzly.android.repos.VersionedRook currentVersionedRook(com.orgzly.android.repos.VersionedRook last) throws java.io.IOException {
    org.eclipse.jgit.revwalk.RevCommit newCommit = synchronizer.currentHead();
    return new com.orgzly.android.repos.VersionedRook(last, newCommit.name(), newCommit.getCommitTime());
}