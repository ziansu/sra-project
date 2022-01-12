public void execute(org.shipkit.internal.gradle.ReleaseNeededPlugin p) {
    project.getTasks().withType(org.shipkit.gradle.ReleaseNeededTask.class, new org.gradle.api.Action<org.shipkit.gradle.ReleaseNeededTask>() {
        public void execute(org.shipkit.gradle.ReleaseNeededTask t) {
            t.setBranch(branch);
            t.setCommitMessage(java.lang.System.getenv("TRAVIS_COMMIT_MESSAGE"));
            t.setPullRequest(isPullRequest);
        }
    });
}