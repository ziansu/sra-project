public void init() {
    emailGenerator = new com.kinancity.core.generator.email.PlusTrickEmailGenerator(baseEmail);
    com.kinancity.core.generator.username.SequenceUsernameGenerator seqUsernameGenerator = new com.kinancity.core.generator.username.SequenceUsernameGenerator(usernamePattern, startFrom);
    if (((startFrom) + (nbAccounts)) > ((seqUsernameGenerator.getMaxSequence()) + 1)) {
        throw new java.lang.IllegalArgumentException("Sequence would overflow format, use more *");
    }
    usernameGenerator = seqUsernameGenerator;
    passwordGenerator = new com.kinancity.core.generator.password.SinglePasswordGenerator(staticPassword);
    initDone = true;
}