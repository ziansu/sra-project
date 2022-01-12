public boolean deleteMapLayerMetadataObject(edu.harvard.iq.dataverse.MapLayerMetadata mapLayerMetadata, edu.harvard.iq.dataverse.authorization.users.User user) {
    edu.harvard.iq.dataverse.MapLayerMetadataServiceBean.logger.info("deleteMapLayerMetadataObject");
    if ((mapLayerMetadata == null) || (user == null)) {
        return false;
    }
    if (permissionService.userOn(user, mapLayerMetadata.getDataFile().getOwner()).has(Permission.EditDataset)) {
        this.deleteOlderMapThumbnails(mapLayerMetadata);
        em.remove(em.merge(mapLayerMetadata));
        return true;
    }
    return false;
}