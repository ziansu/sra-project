@java.lang.SuppressWarnings(value = { "unchecked" , "rawtypes" })
public java.util.Map<org.osgi.resource.Requirement, java.util.Collection<org.osgi.resource.Capability>> findProviders(java.util.Collection<? extends org.osgi.resource.Requirement> requirements) {
    aQute.lib.collections.MultiMap<org.osgi.resource.Requirement, org.osgi.resource.Capability> result = new aQute.lib.collections.MultiMap<org.osgi.resource.Requirement, org.osgi.resource.Capability>();
    try {
        wrapper.findProviders(result, requirements);
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
    return ((java.util.Map) (result));
}