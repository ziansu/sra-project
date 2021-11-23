public org.kohsuke.stapler.HttpResponse doCommenceLogin() throws java.io.IOException, org.openid4java.OpenIDException {
    final org.openid4java.message.AuthRequest authReq = manager.authenticate(endpoint, ((hudson.model.Hudson.getInstance().getRootUrl()) + (finishUrl)));
    hudson.plugins.openid.OpenIdExtension.extendRequest(authReq);
    java.lang.String url = authReq.getDestinationUrl(true);
    org.kohsuke.stapler.Stapler.getCurrentRequest().getSession().setAttribute(hudson.plugins.openid.OpenIdSession.SESSION_NAME, this.toString());
    return new org.kohsuke.stapler.HttpRedirect(url);
}