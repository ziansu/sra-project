public void update(final java.io.File root) throws org.apache.maven.scm.ScmException {
    return this.scmManager.update(scmRepository, new org.apache.maven.scm.ScmFileSet(root));
}