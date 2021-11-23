public org.eclipse.jgit.revwalk.RevWalk getInitializedRevWalk(yousei.Repository repo, org.eclipse.jgit.revwalk.RevSort revSort) throws java.io.IOException {
    org.eclipse.jgit.revwalk.RevWalk rw = new org.eclipse.jgit.revwalk.RevWalk(repo);
    yousei.AnyObjectId headId;
    headId = repo.resolve(Constants.HEAD);
    org.eclipse.jgit.revwalk.RevCommit root = rw.parseCommit(headId);
    rw.sort(revSort);
    rw.markStart(root);
    return rw;
}