public java.lang.String getUserIdBySpecificIdAndDomainId(org.silverpeas.core.admin.domain.DomainDriverManager ddManager, java.lang.String sSpecificId, java.lang.String sDomainId) throws org.silverpeas.core.admin.service.AdminException {
    try {
        ddManager.getOrganizationSchema();
        org.silverpeas.core.admin.persistence.UserRow ur = ddManager.getOrganization().user.getUserBySpecificId(idAsInt(sDomainId), sSpecificId);
        return idAsString(ur.id);
    } catch (java.lang.Exception e) {
        throw new org.silverpeas.core.admin.service.AdminException(failureOnGetting(("user with specific id " + sSpecificId), ("in domain " + sDomainId)), e);
    } finally {
        ddManager.releaseOrganizationSchema();
    }
}