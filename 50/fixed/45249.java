@java.lang.Override
public javax.ws.rs.core.Response deleteAffiliation(java.lang.String orcid, java.lang.Long putCode) {
    orcidSecurityManager.checkPermissions(ScopePathType.AFFILIATIONS_UPDATE);
    affiliationsManager.checkSourceAndDelete(orcid, putCode);
    return javax.ws.rs.core.Response.noContent().build();
}