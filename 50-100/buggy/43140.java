@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "get-dictitems_itemCode_keywords_datasource")
@com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
public com.liferay.portal.kernel.json.JSONObject getDictItemsByItemCodeDataSourceFitter(java.lang.String collectionCode, java.lang.String itemCode, java.lang.String keywords, long groupId) throws com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException {
    com.liferay.portal.kernel.json.JSONObject jsonObject = com.liferay.portal.kernel.json.JSONFactoryUtil.createJSONObject();
    java.util.List<org.opencps.datamgt.model.DictItem> result = dictItemLocalService.searchDictItemByName_like(collectionCode, itemCode, keywords, groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    for (org.opencps.datamgt.model.DictItem dictItem : result) {
        jsonObject.put(java.lang.String.valueOf(dictItem.getItemCode()), dictItem.getItemName(java.util.Locale.getDefault()));
    }
    return jsonObject;
}