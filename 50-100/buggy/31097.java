public java.lang.String getLastCommitId(hudson.model.AbstractBuild build) throws java.lang.Exception {
    hudson.plugins.mercurial.MercurialChangeSetList changeSets = ((hudson.plugins.mercurial.MercurialChangeSetList) (build.getChangeSets().get(0)));
    java.util.List<hudson.plugins.mercurial.MercurialChangeSet> hgChangeSet = changeSets.getLogs();
    if ((hgChangeSet.size()) < 1) {
        throw new java.lang.Exception("No commits found on change set to send to Bitbucket!");
    }
    return hgChangeSet.get(((hgChangeSet.size()) - 1)).getRevision();
}