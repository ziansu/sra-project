public boolean isAddonAvailableFromProdName(final java.lang.String baseProductName, final org.joda.time.DateTime requestedDate, final org.killbill.billing.catalog.api.Plan targetAddOnPlan, final org.killbill.billing.callcontext.InternalTenantContext context) {
    try {
        final org.killbill.billing.catalog.api.Product product = catalogService.getFullCatalog(context).findProduct(baseProductName, requestedDate);
        return isAddonAvailable(product, targetAddOnPlan);
    } catch (org.killbill.billing.catalog.api.CatalogApiException e) {
        throw new org.killbill.billing.subscription.exceptions.SubscriptionBaseError(e);
    }
}