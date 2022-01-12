public static cz.zcu.kiv.crce.metadata.Resource mapCaps(cz.zcu.kiv.crce.metadata.Resource dest, java.util.Collection<cz.zcu.kiv.crce.metadata.dao.mongodb.internal.db.DbCapability> caps, cz.zcu.kiv.crce.metadata.MetadataFactory metadataFactory, cz.zcu.kiv.crce.metadata.service.MetadataService metadataService) {
    for (cz.zcu.kiv.crce.metadata.dao.mongodb.internal.db.DbCapability cap : caps) {
        if (!(java.util.Objects.equals(NsCrceIdentity.NAMESPACE__CRCE_IDENTITY, cap.getNamespace()))) {
            metadataService.addRootCapability(dest, cz.zcu.kiv.crce.metadata.dao.mongodb.internal.mapper.ResourceMetadataMapper.mapCapability(dest, cap, metadataFactory, metadataService));
        }
    }
    return dest;
}