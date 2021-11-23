@com.liferay.portal.kernel.jsonwebservice.JSONWebService(value = "get-dictitems_itemCode_keywords_datasource")
@com.liferay.portal.security.ac.AccessControlled(guestAccessEnabled = true)
public java.util.List<org.opencps.datamgt.model.DictItem> getDictItemsByItemCodeDataSourceFitter(java.lang.String collectionCode, java.lang.String itemCode, java.lang.String keywords, long groupId) throws com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException {
    java.util.List<org.opencps.datamgt.model.DictItem> result = new java.util.ArrayList<org.opencps.datamgt.model.DictItem>();
    result = dictItemLocalService.searchDictItemByName_like(collectionCode, itemCode, keywords, groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    return result;
}