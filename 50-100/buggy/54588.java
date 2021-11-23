private net.smartcosmos.dto.metadata.Page<net.smartcosmos.dto.metadata.MetadataSingleResponse> findByOwnerTypePage(java.lang.String tenantUrn, java.lang.String ownerType, org.springframework.data.domain.Pageable pageable) {
    net.smartcosmos.dto.metadata.Page<net.smartcosmos.dto.metadata.MetadataSingleResponse> result = net.smartcosmos.dao.metadata.util.MetadataPersistenceUtil.emptyPage();
    try {
        java.util.UUID tenantId = net.smartcosmos.dao.metadata.util.UuidUtil.getUuidFromUrn(tenantUrn);
        org.springframework.data.domain.Page<net.smartcosmos.dao.metadata.domain.MetadataEntity> pageEntity = metadataRepository.findByOwner_TenantIdAndOwner_Type(tenantId, ownerType, pageable);
        return convertPage(pageEntity, net.smartcosmos.dao.metadata.domain.MetadataEntity.class, net.smartcosmos.dto.metadata.MetadataSingleResponse.class);
    } catch (java.lang.IllegalArgumentException e) {
        log.warn("Error processing URN: Tenant URN '{}'", tenantUrn);
    }
    return result;
}