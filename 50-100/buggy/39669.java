private void modifyCollaborators(java.util.Collection<org.kohsuke.github.GHUser> users, java.lang.String method) throws java.io.IOException {
    verifyMine();
    for (org.kohsuke.github.GHUser user : users) {
        new org.kohsuke.github.Requester(root).method(method).to(getApiTailUrl(("collaborators/" + (user.getLogin()))));
    }
}