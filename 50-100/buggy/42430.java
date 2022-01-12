@java.lang.Override
public void delete(java.lang.Long id, com.scf.server.application.security.AuthUser user) {
    com.scf.server.application.model.entity.CollectionEntity collectionEntity = collectionDAO.get(id);
    if (collectionEntity == null) {
        throw new com.scf.server.application.model.exception.RecordNotFoundException(com.scf.server.application.model.exception.ErrorCode.COLLECTION_NOT_FOUND);
    }
    checkPermission(collectionEntity.getUser().getId(), user.getId());
    deleteCollection(collectionEntity);
    collectionDAO.delete(collectionEntity);
}