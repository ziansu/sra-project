private boolean isAddonIncluded(final org.killbill.billing.catalog.api.Product baseProduct, final org.killbill.billing.catalog.api.Plan targetAddOnPlan) {
    final org.killbill.billing.catalog.api.Product targetAddonProduct = targetAddOnPlan.getProduct();
    final org.killbill.billing.catalog.api.Product[] includedAddOns = baseProduct.getIncluded();
    for (final org.killbill.billing.catalog.api.Product curAv : includedAddOns) {
        if (curAv.getName().equals(targetAddonProduct.getName())) {
            return true;
        }
    }
    return false;
}