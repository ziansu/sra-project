private void reload(java.lang.String botName) throws java.io.IOException, org.eclipse.jgit.api.errors.GitAPIException {
    org.eclipse.jgit.storage.file.FileRepositoryBuilder builder = new org.eclipse.jgit.storage.file.FileRepositoryBuilder();
    org.eclipse.jgit.lib.Repository repository = builder.setGitDir(new java.io.File(((arguments.getBasePath()) + "/.git"))).readEnvironment().findGitDir().build();
    org.eclipse.jgit.api.Git git = new org.eclipse.jgit.api.Git(repository);
    git.pull().call();
    initBot(botName);
}