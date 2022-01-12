public static cz.zcu.kiv.crce.metadata.Resource map(cz.zcu.kiv.crce.metadata.dao.mongodb.internal.db.DbResource src, cz.zcu.kiv.crce.metadata.MetadataFactory metadataFactory, cz.zcu.kiv.crce.metadata.service.MetadataService metadataService) {
    cz.zcu.kiv.crce.metadata.Resource dest = metadataFactory.createResource(src.getId());
    metadataService.setUri(dest, src.getUri());
    cz.zcu.kiv.crce.metadata.dao.mongodb.internal.mapper.ResourceMetadataMapper.mapCapability(dest, src.getIdentity(), metadataFactory, metadataService);
    return dest;
}