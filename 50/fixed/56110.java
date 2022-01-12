public java.util.List<models.Organization> getFavoriteOrganizations() {
    java.util.List<models.Organization> organizations = new java.util.ArrayList<>();
    for (models.FavoriteOrganization favoriteOrganization : this.favoriteOrganizations) {
        organizations.add(0, favoriteOrganization.organization);
    }
    return organizations;
}