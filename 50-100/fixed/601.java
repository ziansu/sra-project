private java.util.List<org.eclipse.jgit.revwalk.RevCommit> getCommitsFromBranch(final org.eclipse.jgit.api.Git origin, java.lang.String branch) throws org.eclipse.jgit.api.errors.GitAPIException, org.eclipse.jgit.errors.IncorrectObjectTypeException, org.eclipse.jgit.errors.MissingObjectException {
    java.util.List<org.eclipse.jgit.revwalk.RevCommit> commits = new java.util.ArrayList<>();
    final org.eclipse.jgit.lib.ObjectId id = resolveObjectId(origin, branch);
    for (org.eclipse.jgit.revwalk.RevCommit commit : origin.log().add(id).call()) {
        commits.add(commit);
    }
    return commits;
}