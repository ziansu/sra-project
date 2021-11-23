private org.akaza.openclinica.domain.datamap.ItemData lookupItemData(java.lang.Integer itemId, java.lang.Integer eventCrfId, java.lang.Integer itemOrdinal, java.util.List<org.akaza.openclinica.domain.datamap.ItemData> itemDataList) {
    for (org.akaza.openclinica.domain.datamap.ItemData itemData : itemDataList) {
        if ((((itemData.getItem().getItemId()) == itemId) && ((itemData.getEventCrf().getEventCrfId()) == eventCrfId)) && ((itemData.getOrdinal()) == itemOrdinal))
            return itemData;
        
    }
    return null;
}