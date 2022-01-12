@java.lang.Override
public java.util.Map<java.lang.String, java.lang.String> getLocalCredentials(org.fogbowcloud.manager.occi.request.Request request) {
    if (request == null) {
        return org.fogbowcloud.manager.core.plugins.localcredentails.LocalCredentialsHelper.getCredentialsPerRelatedLocalName(this.properties, LocalCredentialsHelper.FOGBOW_DEFAULTS);
    }
    java.util.Map<java.lang.String, java.lang.String> credentialsPerMember = org.fogbowcloud.manager.core.plugins.localcredentails.LocalCredentialsHelper.getCredentialsPerRelatedLocalName(this.properties, request.getRequestingMemberId());
    if (!(credentialsPerMember.isEmpty())) {
        return credentialsPerMember;
    }
    return org.fogbowcloud.manager.core.plugins.localcredentails.LocalCredentialsHelper.getCredentialsPerRelatedLocalName(this.properties, LocalCredentialsHelper.FOGBOW_DEFAULTS);
}