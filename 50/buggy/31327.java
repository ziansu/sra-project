@java.lang.Override
protected org.ednovo.gooru.core.api.model.Collection fetchSource(java.lang.String gooruOid) {
    return this.getCollectionRepository().getCollectionByGooruOid(gooruOid, null);
}