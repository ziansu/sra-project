public org.silverpeas.core.admin.user.model.UserDetail getUserDetail(org.silverpeas.core.admin.domain.DomainDriverManager ddManager, java.lang.String sUserId) throws org.silverpeas.core.admin.service.AdminException {
    try {
        ddManager.getOrganizationSchema();
        org.silverpeas.core.admin.persistence.UserRow ur = ddManager.getOrganization().user.getUser(idAsInt(sUserId));
        return ur != null ? userRow2UserDetail(ur) : null;
    } catch (java.lang.Exception e) {
        throw new org.silverpeas.core.admin.service.AdminException(failureOnGetting("user", sUserId), e);
    } finally {
        ddManager.releaseOrganizationSchema();
    }
}