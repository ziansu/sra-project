@java.lang.Override
public void deleteCollectionItem(java.lang.String collectionItemId) {
    org.ednovo.gooru.core.api.model.CollectionItem collectionItem = this.getCollectionRepository().getCollectionItemById(collectionItemId);
    if (collectionItem != null) {
        this.getCollectionRepository().remove(org.ednovo.gooru.core.api.model.CollectionItem.class, collectionItem.getCollectionItemId());
    }
    try {
        indexHandler.setReIndexRequest(collectionItem.getResource().getGooruOid(), IndexProcessor.INDEX, org.ednovo.gooru.domain.service.RESOURCE, null, false, false);
    } catch (java.lang.Exception e) {
        org.ednovo.gooru.log.Log.write(org.ednovo.gooru.domain.service.ScollectionServiceImpl.LOGGER, "Error", e);
    }
}