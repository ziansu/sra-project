private java.lang.String buildOAuthRedirectUrl() {
    java.lang.String rootUrl = jenkins.model.Jenkins.getInstance().getRootUrl();
    if (rootUrl == null) {
        throw new java.lang.NullPointerException("Jenkins root url should not be null");
    }else {
        return rootUrl + "securityRealm/finishLogin";
    }
}