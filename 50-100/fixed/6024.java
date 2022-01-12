public void requireFeature(java.lang.String name, java.lang.String range, boolean mandatory) {
    if (mandatory) {
        org.apache.karaf.features.internal.resolver.ResourceUtils.addIdentityRequirement(this, name, org.apache.karaf.features.internal.resolver.ResourceUtils.TYPE_FEATURE, range);
    }else {
        org.apache.karaf.features.internal.resolver.ResourceImpl res = new org.apache.karaf.features.internal.resolver.ResourceImpl();
        org.apache.karaf.features.internal.resolver.ResourceUtils.addIdentityRequirement(res, name, org.apache.karaf.features.internal.resolver.ResourceUtils.TYPE_FEATURE, range, false);
        dependentFeatures.addAll(res.getRequirements(null));
    }
}