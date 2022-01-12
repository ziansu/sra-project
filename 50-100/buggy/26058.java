private java.util.List<org.oscm.internal.marketplace.POOrganization> preparePOOrganizationsList() {
    java.util.List<org.oscm.internal.marketplace.POOrganization> organizations = new java.util.ArrayList<>();
    organizations.add(preparePOOrganization(1L, "org1", true));
    organizations.add(preparePOOrganization(2L, "org2", false));
    model.getAccessesStored().put(1L, new java.lang.Boolean(false));
    model.getAccessesStored().put(2L, new java.lang.Boolean(true));
    return organizations;
}