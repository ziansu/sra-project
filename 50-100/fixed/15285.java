public org.apache.karaf.features.internal.region.Subsystem createSubsystem(java.lang.String name, boolean acceptDependencies) {
    if ((feature) != null) {
        throw new java.lang.UnsupportedOperationException("Can not create application subsystems inside a feature subsystem");
    }
    java.lang.String childName = ((getName()) + "/") + name;
    org.apache.karaf.features.internal.region.Subsystem as = new org.apache.karaf.features.internal.region.Subsystem(childName, this, acceptDependencies, true);
    children.add(as);
    org.apache.karaf.features.internal.resolver.ResourceUtils.addIdentityRequirement(this, childName, org.apache.karaf.features.internal.resolver.ResourceUtils.TYPE_SUBSYSTEM, ((org.apache.felix.utils.version.VersionRange) (null)));
    installable.add(as);
    return as;
}