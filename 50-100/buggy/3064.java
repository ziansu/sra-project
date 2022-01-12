@java.lang.Override
public javax.ws.rs.core.Response viewWorkSummary(java.lang.String orcid, java.lang.Long putCode) {
    orcidSecurityManager.checkPermissions(ScopePathType.ORCID_WORKS_READ_LIMITED, orcid);
    org.orcid.jaxb.model.record.summary_rc2.WorkSummary ws = workManager.getWorkSummary(orcid, putCode);
    org.orcid.api.common.util.ActivityUtils.cleanEmptyFields(ws);
    orcidSecurityManager.checkVisibility(ws);
    org.orcid.api.common.util.ActivityUtils.setPathToActivity(ws, orcid);
    return javax.ws.rs.core.Response.ok(ws).build();
}