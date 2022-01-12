private static org.eclipse.jgit.revwalk.RevCommit getHeadCommit(org.eclipse.jgit.lib.Repository repository) {
    org.eclipse.jgit.revwalk.RevCommit headCommit = null;
    try (org.eclipse.jgit.revwalk.RevWalk rw = new org.eclipse.jgit.revwalk.RevWalk(repository)) {
        org.eclipse.jgit.lib.ObjectId parentId = repository.resolve(Constants.HEAD);
        if (parentId != null)
            headCommit = rw.parseCommit(parentId);
        
    } catch (java.io.IOException e) {
        org.eclipse.egit.ui.Activator.handleError(UIText.CommitAction_errorRetrievingCommit, e, true);
    }
    return headCommit;
}