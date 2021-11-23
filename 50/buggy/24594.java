public static org.apache.felix.resolver.util.ShadowList deepCopy(org.apache.felix.resolver.util.ShadowList original) {
    java.util.List<org.osgi.resource.Capability> originalCopy = new java.util.ArrayList<org.osgi.resource.Capability>(original.m_original);
    return new org.apache.felix.resolver.util.ShadowList(original.unmodifiable, originalCopy, original.isUnmodifiable);
}