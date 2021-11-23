public void setChildrenOrganizations(java.util.Set<org.tdl.vireo.model.Organization> childrenOrganizations) {
    childrenOrganizations.stream().forEach(( childOrganization) -> {
        childOrganization.addParentOrganization(this);
    });
    this.childrenOrganizations = childrenOrganizations;
}