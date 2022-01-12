private java.util.Set<org.opendaylight.groupbasedpolicy.dto.IndexedTenant> getIndexedTenants(java.util.Collection<org.opendaylight.groupbasedpolicy.resolver.PolicyResolver.TenantContext> tenantCtxs) {
    java.util.Set<org.opendaylight.groupbasedpolicy.dto.IndexedTenant> result = new java.util.HashSet<>();
    for (org.opendaylight.groupbasedpolicy.resolver.PolicyResolver.TenantContext tenant : tenantCtxs) {
        org.opendaylight.groupbasedpolicy.dto.IndexedTenant t = tenant.tenant.get();
        if (t != null) {
            result.add(t);
        }
    }
    return result;
}