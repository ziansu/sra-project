public com.jaspersoft.jasperserver.jaxrs.client.apiadapters.authority.organizations.SingleOrganizationAdapter organization(com.jaspersoft.jasperserver.dto.authority.ClientTenant organization) {
    if ((organization != null) && ((((organization.getAlias()) != null) && (!(organization.getAlias().isEmpty()))) || (((organization.getId()) != null) && (!(organization.getId().isEmpty()))))) {
        return new com.jaspersoft.jasperserver.jaxrs.client.apiadapters.authority.organizations.SingleOrganizationAdapter(sessionStorage, organization);
    }
    throw new java.lang.IllegalArgumentException("Organization is not valid.");
}