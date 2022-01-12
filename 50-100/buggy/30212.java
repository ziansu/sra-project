public javax.faces.model.DataModel<?> getOffers() {
    boolean useHistory = getUseHistory();
    if (!useHistory) {
        if ((offersModel) == null) {
            offersModel = new javax.faces.model.ListDataModel<net.travel.ejb.data.model.Toferta>(request.getOffers(startPage, ((startPage) + (pageSize)), getMinDurationValue(), getMaxDurationValue(), getMinPriceValue(), getMaxPriceValue(), getCountryValue(), getDepartureStartDate(), getDepartureEndDate(), showExpired));
        }
    }
    return offersModel;
}