private java.util.Set<org.opendaylight.groupbasedpolicy.dto.IndexedTenant> getIndexedTenants(java.util.Collection<org.opendaylight.groupbasedpolicy.dto.IndexedTenant> tenantCtxs) {
    java.util.Set<org.opendaylight.groupbasedpolicy.dto.IndexedTenant> result = new java.util.HashSet<>();
    for (org.opendaylight.groupbasedpolicy.dto.IndexedTenant tenant : tenantCtxs) {
        if (tenant != null) {
            result.add(tenant);
        }
    }
    return result;
}