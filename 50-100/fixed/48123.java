protected org.jdom.Element internalSelect(java.lang.String id, boolean isIndexingTask) throws java.lang.Exception {
    org.fao.geonet.repository.MetadataRepository _metadataRepository = org.fao.geonet.ApplicationContextHolder.get().getBean(org.fao.geonet.repository.MetadataRepository.class);
    org.fao.geonet.domain.IMetadata metadata = _metadataRepository.findOne(id);
    if (metadata == null) {
        org.fao.geonet.repository.MetadataDraftRepository _metadataDraftRepository = org.fao.geonet.ApplicationContextHolder.get().getBean(org.fao.geonet.repository.MetadataDraftRepository.class);
        metadata = _metadataDraftRepository.findOne(id);
    }
    if (metadata == null)
        return null;
    
    return removeHiddenElements(isIndexingTask, metadata);
}