private int indexOfVersionForDate(final java.util.Date date) throws org.killbill.billing.catalog.api.CatalogApiException {
    for (int i = (versions.size()) - 1; i >= 0; i--) {
        final org.killbill.billing.catalog.StandaloneCatalog c = versions.get(i);
        if ((c.getEffectiveDate().getTime()) < (date.getTime())) {
            return i;
        }
    }
    throw new org.killbill.billing.catalog.api.CatalogApiException(org.killbill.billing.ErrorCode.CAT_NO_CATALOG_FOR_GIVEN_DATE, date.toString());
}