public void execute(org.shipkit.gradle.ReleaseNeededTask t) {
    t.setCommitMessage(java.lang.System.getenv("TRAVIS_COMMIT_MESSAGE"));
    t.setPullRequest(isPullRequest);
}