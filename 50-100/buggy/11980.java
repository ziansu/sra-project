private org.springframework.http.ResponseEntity<?> createTenantWorker(net.smartcosmos.usermanagement.tenant.dto.CreateTenantRequest createTenantRequest, net.smartcosmos.security.user.SmartCosmosUser user) {
    java.util.Optional<net.smartcosmos.usermanagement.tenant.dto.CreateTenantResponse> createTenantResponse = tenantDao.createTenant(createTenantRequest);
    if (createTenantResponse.isPresent()) {
        eventSendingService.sendEvent(user, net.smartcosmos.usermanagement.event.TenantEventType.TENANT_CREATED, createTenantResponse.get());
        return buildCreatedResponseEntity(createTenantResponse.get());
    }else {
        eventSendingService.sendEvent(user, net.smartcosmos.usermanagement.event.TenantEventType.TENANT_CREATE_FAILED_ALREADY_EXISTS, createTenantRequest);
        return org.springframework.http.ResponseEntity.status(HttpStatus.CONFLICT).build();
    }
}