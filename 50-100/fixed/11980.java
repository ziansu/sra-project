private org.springframework.http.ResponseEntity<?> createTenantWorker(net.smartcosmos.usermanagement.tenant.dto.CreateTenantRequest createTenantRequest, net.smartcosmos.security.user.SmartCosmosUser user) {
    java.util.Optional<net.smartcosmos.usermanagement.tenant.dto.CreateTenantResponse> createTenantResponse = tenantDao.createTenant(createTenantRequest);
    if (createTenantResponse.isPresent()) {
        return buildCreatedResponseEntity(createTenantResponse.get());
    }else {
        return org.springframework.http.ResponseEntity.status(HttpStatus.CONFLICT).build();
    }
}