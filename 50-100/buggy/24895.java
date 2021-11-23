public org.apache.stratos.common.beans.TenantInfoBean[] retrievePartialSearchTenants(java.lang.String searchDomain) throws org.apache.stratos.rest.endpoint.exception.RestAPIException {
    java.util.List<org.apache.stratos.common.beans.TenantInfoBean> searchResult = new java.util.LinkedList<org.apache.stratos.common.beans.TenantInfoBean>();
    for (java.lang.String tenantDomain : tenantMap.keySet()) {
        if (tenantDomain.contains(searchDomain)) {
            searchResult.add(new org.apache.stratos.common.beans.TenantInfoBean(tenantMap.get(tenantDomain)));
        }
    }
    return searchResult.toArray(new org.apache.stratos.common.beans.TenantInfoBean[0]);
}