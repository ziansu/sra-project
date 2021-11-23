public org.fornax.soa.basedsl.ref.DependencyDescription getTransitiveDependencies(final org.fornax.soa.serviceDsl.Property prop, final boolean includeInheritedProperties, final boolean includeCycleTypes, java.util.List<org.eclipse.xtext.resource.IEObjectDescription> visitedDependendies, org.fornax.soa.basedsl.ref.DependencyDescription referrer) {
    org.fornax.soa.serviceDsl.TypeRef typeRef = prop.getType();
    if (typeRef instanceof org.fornax.soa.serviceDsl.VersionedTypeRef) {
        org.fornax.soa.serviceDsl.VersionedTypeRef verTypeRef = ((org.fornax.soa.serviceDsl.VersionedTypeRef) (typeRef));
        org.fornax.soa.serviceDsl.VersionedType verType = verTypeRef.getType();
        org.fornax.soa.basedsl.ref.DependencyDescription depRef = buildDependencyDescription(prop, ((org.fornax.soa.serviceDsl.BusinessObject) (verType)), includeInheritedProperties, includeCycleTypes, visitedDependendies, referrer);
        return depRef;
    }
    return null;
}