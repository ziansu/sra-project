@org.kohsuke.accmod.Restricted(value = org.kohsuke.accmod.restrictions.NoExternalUse.class)
public java.lang.String getGitHubText() {
    hudson.security.SecurityRealm r = jenkins.model.Jenkins.getInstance().getSecurityRealm();
    if (r instanceof org.jenkinsci.plugins.GithubSecurityRealm) {
        org.jenkinsci.plugins.GithubSecurityRealm ghsr = ((org.jenkinsci.plugins.GithubSecurityRealm) (r));
        return ghsr.getDescriptor().getDefaultGithubWebUri().equals(ghsr.getGithubWebUri()) ? "GitHub" : "GitHub Enterprise";
    }
    return "";
}