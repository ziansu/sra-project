@java.lang.Override
public org.greenscape.organization.OrganizationEntity findById(java.lang.Object id) {
    return manager.findById(org.greenscape.organization.OrganizationEntity.class, id.toString());
}