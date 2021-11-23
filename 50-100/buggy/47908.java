@java.lang.Override
public java.util.Map<java.lang.String, java.lang.String> getLocalCredentials(org.fogbowcloud.manager.occi.request.Request request) {
    java.lang.String member = getVO(request);
    java.util.Map<java.lang.String, java.lang.String> credentialsPerMember = org.fogbowcloud.manager.core.plugins.localcredentails.LocalCredentialsHelper.getCredentialsPerRelatedLocalName(this.properties, member);
    if (!(credentialsPerMember.isEmpty())) {
        return credentialsPerMember;
    }
    return org.fogbowcloud.manager.core.plugins.localcredentails.LocalCredentialsHelper.getCredentialsPerRelatedLocalName(this.properties, LocalCredentialsHelper.FOGBOW_DEFAULTS);
}