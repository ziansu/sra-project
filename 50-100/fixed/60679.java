@com.liferay.portal.kernel.search.Indexable(type = com.liferay.portal.kernel.search.IndexableType.DELETE)
@java.lang.Override
@com.liferay.portal.kernel.systemevent.SystemEvent(action = com.liferay.portal.model.SystemEventConstants.ACTION_SKIP, type = com.liferay.portal.model.SystemEventConstants.TYPE_DELETE)
public com.liferay.portlet.asset.model.AssetVocabulary deleteVocabulary(com.liferay.portlet.asset.model.AssetVocabulary vocabulary) throws com.liferay.portal.kernel.exception.PortalException {
    assetVocabularyPersistence.remove(vocabulary);
    resourceLocalService.deleteResource(vocabulary.getCompanyId(), com.liferay.portlet.asset.model.AssetVocabulary.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, vocabulary.getVocabularyId());
    assetCategoryLocalService.deleteVocabularyCategories(vocabulary.getVocabularyId());
    return vocabulary;
}