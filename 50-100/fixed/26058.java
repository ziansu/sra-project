private java.util.List<org.oscm.internal.marketplace.POOrganization> preparePOOrganizationsList() {
    java.util.List<org.oscm.internal.marketplace.POOrganization> organizations = new java.util.ArrayList<>();
    organizations.add(preparePOOrganization(1L, "org1", true));
    organizations.add(preparePOOrganization(2L, "org2", false));
    return organizations;
}