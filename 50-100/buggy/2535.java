@java.lang.Override
protected java.lang.String getPostLogOutUrl(org.kohsuke.stapler.StaplerRequest req, org.acegisecurity.Authentication auth) {
    if (jenkins.model.Jenkins.getInstance().hasPermission(Jenkins.READ)) {
        return super.getPostLogOutUrl(req, auth);
    }
    return ((req.getContextPath()) + "/") + (GithubLogoutAction.POST_LOGOUT_URL);
}