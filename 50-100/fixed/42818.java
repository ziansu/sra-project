@java.lang.Override
public javax.ws.rs.core.Response createFunding(java.lang.String orcid, org.orcid.jaxb.model.record_rc2.Funding funding) {
    orcidSecurityManager.checkPermissions(ScopePathType.FUNDING_CREATE);
    org.orcid.jaxb.model.record_rc2.Funding f = profileFundingManager.createFunding(orcid, funding);
    try {
        return javax.ws.rs.core.Response.created(new java.net.URI(java.lang.String.valueOf(f.getPutCode()))).build();
    } catch (java.net.URISyntaxException e) {
        throw new java.lang.RuntimeException(localeManager.resolveMessage("apiError.createfunding_response.exception"), e);
    }
}