@org.kohsuke.accmod.Restricted(value = org.kohsuke.accmod.restrictions.NoExternalUse.class)
public java.lang.String getGitHubText() {
    jenkins.model.Jenkins j = jenkins.model.Jenkins.getInstance();
    assert j != null;
    hudson.security.SecurityRealm r = j.getSecurityRealm();
    if (r instanceof org.jenkinsci.plugins.GithubSecurityRealm) {
        org.jenkinsci.plugins.GithubSecurityRealm ghsr = ((org.jenkinsci.plugins.GithubSecurityRealm) (r));
        return ghsr.getDescriptor().getDefaultGithubWebUri().equals(ghsr.getGithubWebUri()) ? "GitHub" : "GitHub Enterprise";
    }
    return "";
}