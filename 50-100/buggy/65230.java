public com.jaspersoft.jasperserver.jaxrs.client.apiadapters.authority.organizations.SingleOrganizationAdapter organization(com.jaspersoft.jasperserver.dto.authority.ClientTenant organization) {
    if ((organization == null) || (((organization.getId()) == null) || ((organization.getId().equals("")) && (((organization.getAlias()) == null) || (organization.getAlias().equals("")))))) {
        throw new java.lang.IllegalArgumentException("Organization is not valid.");
    }
    return new com.jaspersoft.jasperserver.jaxrs.client.apiadapters.authority.organizations.SingleOrganizationAdapter(sessionStorage, organization);
}