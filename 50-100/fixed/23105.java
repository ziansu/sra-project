public java.util.Set<java.lang.String> getLicensedContentIds() {
    java.util.List<sernet.hui.common.connect.Property> properties = entity.getProperties(sernet.verinice.model.common.configuration.Configuration.PROP_LICENSED_CONTENT_IDS).getProperties();
    java.util.Set<java.lang.String> licenseIds;
    if (properties != null) {
        licenseIds = new java.util.HashSet(properties.size());
        for (sernet.hui.common.connect.Property p : properties) {
            licenseIds.add(p.getPropertyValue());
        }
    }else {
        licenseIds = new java.util.HashSet<>();
    }
    return licenseIds;
}