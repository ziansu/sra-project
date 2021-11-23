public org.egov.domain.model.Tenant fetchTenantById(java.lang.String tenantId) {
    final org.egov.persistence.dto.RequestInfoBody requestInfoBody = new org.egov.persistence.dto.RequestInfoBody(org.egov.common.contract.request.RequestInfo.builder().build());
    org.egov.persistence.dto.TenantResponse tenantResponse = restTemplate.postForObject(tenantServiceUrl, requestInfoBody, org.egov.persistence.dto.TenantResponse.class, tenantId);
    return tenantResponse.toDomainTenant();
}