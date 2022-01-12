private java.util.List<java.lang.String> validate(org.eclipse.jgit.revwalk.RevWalk rw, org.eclipse.jgit.revwalk.RevCommit c, boolean verbose, com.google.gerrit.server.config.PluginConfig cfg) throws java.lang.Exception {
    com.googlesource.gerrit.plugins.findowners.OwnersValidatorTest.MockedEmails myEmails = new com.googlesource.gerrit.plugins.findowners.OwnersValidatorTest.MockedEmails();
    com.googlesource.gerrit.plugins.findowners.OwnersValidator validator = new com.googlesource.gerrit.plugins.findowners.OwnersValidator(null, null, null, myEmails);
    java.lang.String ownersFileName = com.googlesource.gerrit.plugins.findowners.OwnersValidator.getOwnersFileName(cfg);
    java.util.List<com.google.gerrit.server.git.validators.CommitValidationMessage> m = validator.performValidation(repo, c, rw, ownersFileName, verbose);
    return com.googlesource.gerrit.plugins.findowners.OwnersValidatorTest.transformMessages(m);
}