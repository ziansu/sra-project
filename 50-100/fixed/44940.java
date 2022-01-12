@java.lang.Override
public javax.ws.rs.core.Response viewFunding(java.lang.String orcid, java.lang.Long putCode) {
    orcidSecurityManager.checkPermissions(ScopePathType.FUNDING_READ_LIMITED);
    org.orcid.jaxb.model.record_rc2.Funding f = profileFundingManager.getFunding(orcid, putCode);
    orcidSecurityManager.checkVisibility(f);
    org.orcid.api.common.util.ActivityUtils.setPathToActivity(f, orcid);
    return javax.ws.rs.core.Response.ok(f).build();
}