protected javax.portlet.PortletPreferences updateImportPortletPreferences(com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext, javax.portlet.PortletPreferences portletPreferences) throws java.lang.Exception {
    com.liferay.portal.kernel.model.Company company = _companyLocalService.getCompanyById(portletDataContext.getCompanyId());
    com.liferay.portal.kernel.model.Group companyGroup = company.getGroup();
    updateImportPortletPreferencesClassPKs(portletDataContext, portletPreferences, "organizationId", com.liferay.portal.kernel.model.Organization.class, companyGroup.getGroupId());
    return portletPreferences;
}