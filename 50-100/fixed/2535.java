@java.lang.Override
protected java.lang.String getPostLogOutUrl(org.kohsuke.stapler.StaplerRequest req, org.acegisecurity.Authentication auth) {
    jenkins.model.Jenkins j = jenkins.model.Jenkins.getInstance();
    assert j != null;
    if (j.hasPermission(Jenkins.READ)) {
        return super.getPostLogOutUrl(req, auth);
    }
    return ((req.getContextPath()) + "/") + (GithubLogoutAction.POST_LOGOUT_URL);
}