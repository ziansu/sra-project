@java.lang.Override
public void deleteQuestionWithCollectionItem(final java.lang.String collectionId, final java.lang.String resourceId) {
    final org.ednovo.gooru.core.api.model.CollectionItem collectionItem = this.getCollectionRepository().getCollectionItemByResourceOid(collectionId, resourceId);
    if (collectionItem == null) {
        throw new org.ednovo.gooru.core.exception.NotFoundException(generateErrorMessage(org.ednovo.gooru.domain.service.GL0056, org.ednovo.gooru.domain.service.COLLECTION_ITEM), GL0056);
    }
    this.getCollectionRepository().remove(collectionItem);
}