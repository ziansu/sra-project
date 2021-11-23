@java.lang.Override
public javax.ws.rs.core.Response viewEducation(java.lang.String orcid, java.lang.Long putCode) {
    orcidSecurityManager.checkPermissions(ScopePathType.AFFILIATIONS_READ_LIMITED, orcid);
    org.orcid.jaxb.model.record_rc2.Education e = affiliationsManager.getEducationAffiliation(orcid, putCode);
    orcidSecurityManager.checkVisibility(e);
    org.orcid.api.common.util.ActivityUtils.setPathToActivity(e, orcid);
    return javax.ws.rs.core.Response.ok(e).build();
}