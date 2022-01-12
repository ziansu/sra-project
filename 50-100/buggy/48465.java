protected org.compiere.model.MPriceListVersion loadPriceListVersion(int priceListId) {
    priceListVersionId = 0;
    this.priceListId = priceListId;
    org.compiere.model.MPriceList priceList = org.compiere.model.MPriceList.get(ctx, priceListId, null);
    org.compiere.model.MPriceListVersion priceListVersion = priceList.getPriceListVersion(getToday());
    if ((priceListVersion != null) && ((priceListVersion.getM_PriceList_Version_ID()) != 0)) {
        priceListVersionId = priceListVersion.getM_PriceList_Version_ID();
    }
    return priceListVersion;
}