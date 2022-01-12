private void commitTestFile(com.sillelien.github.GHMyself myself, java.io.File repoDir, org.eclipse.jgit.api.Git origin) throws java.io.IOException, org.eclipse.jgit.api.errors.GitAPIException {
    java.io.File dummyFile = createDummyFile(repoDir);
    org.eclipse.jgit.dircache.DirCache cache = origin.add().addFilepattern(dummyFile.getName()).call();
    origin.commit().setMessage("test commit").call();
    origin.push().setCredentialsProvider(getCredentialsProvider(myself)).call();
}