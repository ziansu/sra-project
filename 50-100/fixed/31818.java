private net.smartcosmos.dto.things.Page<net.smartcosmos.dto.things.ThingResponse> findByType(java.lang.String tenantUrn, java.lang.String type, org.springframework.data.domain.Pageable pageable) {
    java.util.UUID tenantId = net.smartcosmos.dao.things.util.UuidUtil.getUuidFromUrn(tenantUrn);
    org.springframework.data.domain.Page<net.smartcosmos.dao.things.domain.ThingEntity> pageResponse = repository.findByTenantIdAndTypeIgnoreCase(tenantId, type, pageable);
    return conversionService.convert(pageResponse, net.smartcosmos.dao.things.util.ThingPersistenceUtil.emptyPage().getClass());
}