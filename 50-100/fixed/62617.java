@java.lang.Override
public javax.ws.rs.core.Response createWork(java.lang.String orcid, org.orcid.jaxb.model.record_rc2.Work work) {
    orcidSecurityManager.checkPermissions(ScopePathType.ORCID_WORKS_CREATE);
    org.orcid.jaxb.model.record_rc2.Work w = workManager.createWork(orcid, work, true);
    try {
        return javax.ws.rs.core.Response.created(new java.net.URI(java.lang.String.valueOf(w.getPutCode()))).build();
    } catch (java.net.URISyntaxException e) {
        throw new java.lang.RuntimeException(localeManager.resolveMessage("apiError.creatework_response.exception"), e);
    }
}