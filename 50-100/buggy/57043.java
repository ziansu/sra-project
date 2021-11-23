@java.lang.Override
public org.ednovo.gooru.core.api.model.ActionResponseDTO<org.ednovo.gooru.core.api.model.CollectionItem> updateQuestionWithCollectionItem(java.lang.String collectionId, java.lang.String resourceId, java.lang.String data, java.util.List<java.lang.Integer> deleteAssets, org.ednovo.gooru.core.api.model.User user, java.lang.String mediaFileName) throws java.lang.Exception {
    org.ednovo.gooru.core.api.model.CollectionItem collectionItem = this.getCollectionRepository().getCollectionItemByResourceOid(collectionId, resourceId);
    if (collectionItem == null) {
        throw new org.ednovo.gooru.core.exception.NotFoundException(generateErrorMessage(org.ednovo.gooru.domain.service.GL0056, org.ednovo.gooru.domain.service.COLLECTION_ITEM), GL0056);
    }
    return updateQuestionWithCollectionItem(collectionItem, data, deleteAssets, user, mediaFileName);
}