@java.lang.Override
public void deletePathway(java.lang.String classId, java.lang.String pathwayGooruOid, org.ednovo.gooru.core.api.model.User user) {
    final java.util.List<org.ednovo.gooru.core.api.model.CollectionItem> collectionItems = this.getCollectionRepository().getCollectionItemByParentId(pathwayGooruOid, null, null);
    for (org.ednovo.gooru.core.api.model.CollectionItem item : collectionItems) {
        this.deleteCollectionItem(item.getCollectionItemId(), user, true);
    }
    this.getCollectionService().deleteCollection(pathwayGooruOid, user);
    getAsyncExecutor().deleteFromCache((("v2-class-data-" + classId) + "*"));
}