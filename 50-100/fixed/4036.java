@java.lang.Override
public javax.ws.rs.core.Response createEmployment(java.lang.String orcid, org.orcid.jaxb.model.record_rc2.Employment employment) {
    orcidSecurityManager.checkPermissions(ScopePathType.AFFILIATIONS_CREATE);
    org.orcid.jaxb.model.record_rc2.Employment e = affiliationsManager.createEmploymentAffiliation(orcid, employment);
    try {
        return javax.ws.rs.core.Response.created(new java.net.URI(java.lang.String.valueOf(e.getPutCode()))).build();
    } catch (java.net.URISyntaxException ex) {
        throw new java.lang.RuntimeException(localeManager.resolveMessage("apiError.createemployment_response.exception"), ex);
    }
}