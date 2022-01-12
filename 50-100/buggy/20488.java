public boolean isAddonIncludedFromPlanName(final java.lang.String basePlanName, final org.joda.time.DateTime requestedDate, final org.killbill.billing.catalog.api.Plan targetAddOnPlan, final org.killbill.billing.callcontext.InternalTenantContext context) {
    try {
        final org.killbill.billing.catalog.api.Plan plan = catalogService.getFullCatalog(context).findPlan(basePlanName, requestedDate);
        final org.killbill.billing.catalog.api.Product product = plan.getProduct();
        return isAddonIncluded(product, targetAddOnPlan);
    } catch (org.killbill.billing.catalog.api.CatalogApiException e) {
        throw new org.killbill.billing.subscription.exceptions.SubscriptionBaseError(e);
    }
}