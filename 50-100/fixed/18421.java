private net.smartcosmos.dto.things.Page<net.smartcosmos.dto.things.ThingResponse> findAll(java.lang.String tenantUrn, org.springframework.data.domain.Pageable pageable) {
    java.util.UUID tenantId = net.smartcosmos.dao.things.util.UuidUtil.getUuidFromUrn(tenantUrn);
    org.springframework.data.domain.Page<net.smartcosmos.dao.things.domain.ThingEntity> pageResponse = repository.findByTenantId(tenantId, pageable);
    return conversionService.convert(pageResponse, net.smartcosmos.dao.things.util.ThingPersistenceUtil.emptyPage().getClass());
}