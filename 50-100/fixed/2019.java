@java.lang.Override
public javax.ws.rs.core.Response viewPerson(java.lang.String orcid) {
    orcidSecurityManager.checkPermissions(ScopePathType.ORCID_BIO_READ_LIMITED);
    org.orcid.jaxb.model.record_rc2.Person person = profileEntityManager.getPersonDetails(orcid);
    person = visibilityFilter.filter(person);
    org.orcid.api.common.util.ElementUtils.setPathToPerson(person, orcid);
    return javax.ws.rs.core.Response.ok(person).build();
}