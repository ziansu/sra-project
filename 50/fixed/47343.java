public org.jenkinsci.plugins.ghprb.GhprbGithubCredentials getCredentials() {
    if ((this.credentials) == null) {
        this.credentials = org.jenkinsci.plugins.ghprb.GhprbTrigger.DESCRIPTOR.getDefaultCredentials();
    }
    org.jenkinsci.plugins.ghprb.GhprbTrigger.DESCRIPTOR.saveSetup();
    return credentials;
}