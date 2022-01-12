private void deleteCollection(com.scf.server.application.model.entity.CollectionEntity collectionEntity) {
    for (com.scf.server.application.model.entity.CollectionEntity entity : collectionEntity.getCollectionList()) {
        collectionDAO.delete(entity);
        deleteCollection(entity);
    }
}