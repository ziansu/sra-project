@java.lang.Override
public void setCollectionMetaData(org.ednovo.gooru.shared.model.analytics.CollectionSummaryMetaDataDo result, java.lang.String pathwayId, java.lang.String classpageId) {
    this.classpageId = classpageId;
    this.pathwayId = pathwayId;
    if (org.ednovo.gooru.shared.util.StringUtil.checkNull(result)) {
        collectionId = result.getGooruOId();
        collectionSummaryWidget.setData(result);
        collectionSummaryDetails.add(collectionSummaryWidget);
    }
}