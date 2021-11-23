private org.extensiblecatalog.ncip.v2.service.HoldingsSet parseHoldingsSet(org.extensiblecatalog.ncip.v2.koha.item.MarcItem marcItem, org.extensiblecatalog.ncip.v2.service.LookupItemSetInitiationData initData) throws org.extensiblecatalog.ncip.v2.koha.util.KohaException {
    org.extensiblecatalog.ncip.v2.service.HoldingsSet holdingsSet = new org.extensiblecatalog.ncip.v2.service.HoldingsSet();
    if (initData.getBibliographicDescriptionDesired()) {
        org.extensiblecatalog.ncip.v2.service.BibliographicDescription bDesc = org.extensiblecatalog.ncip.v2.koha.util.KohaUtil.parseBibliographicDescription(marcItem);
        holdingsSet.setBibliographicDescription(bDesc);
    }
    org.extensiblecatalog.ncip.v2.service.ItemInformation info = new org.extensiblecatalog.ncip.v2.service.ItemInformation();
    info.setItemId(org.extensiblecatalog.ncip.v2.koha.util.KohaUtil.parseItemId(marcItem));
    info.setItemOptionalFields(org.extensiblecatalog.ncip.v2.koha.util.KohaUtil.parseItemOptionalFields(marcItem));
    holdingsSet.setItemInformations(java.util.Arrays.asList(info));
    return holdingsSet;
}