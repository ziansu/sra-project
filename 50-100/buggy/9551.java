@java.lang.Override
protected org.eclipse.jgit.lib.Repository obtainRepository() throws org.eclipse.jgit.api.errors.GitAPIException {
    org.eclipse.jgit.api.CloneCommand cloneCommand = org.eclipse.jgit.api.Git.cloneRepository();
    cloneCommand.setURI(this.remoteURL);
    cloneCommand.setCredentialsProvider(this.ownerAuth);
    cloneCommand.setDirectory(this.localPath.toFile());
    org.eclipse.jgit.api.Git cloneCall = null;
    cloneCall = cloneCommand.call();
    cloneCall.close();
    return cloneCall.getRepository();
}