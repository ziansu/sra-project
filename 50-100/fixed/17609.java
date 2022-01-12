protected org.jenkinsci.plugins.authorizeproject.strategy.SpecificUsersAuthorizationStrategy newInstanceWithoutAuthentication(org.kohsuke.stapler.StaplerRequest req, net.sf.json.JSONObject formData) throws hudson.model.Descriptor.FormException {
    java.lang.String userid = formData.getString("userid");
    boolean noNeedReauthentication = formData.getBoolean("noNeedReauthentication");
    if (org.apache.commons.lang.StringUtils.isBlank(userid)) {
        throw new hudson.model.Descriptor.FormException("userid must be specified", "userid");
    }
    if (userid.equals(ACL.SYSTEM.getPrincipal())) {
        throw new hudson.model.Descriptor.FormException(org.jenkinsci.plugins.authorizeproject.strategy.Messages.SpecificUsersAuthorizationStrategy_userid_notSystem(), "userid");
    }
    return new org.jenkinsci.plugins.authorizeproject.strategy.SpecificUsersAuthorizationStrategy(userid, noNeedReauthentication);
}