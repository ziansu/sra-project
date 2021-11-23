public java.lang.String save() {
    setDisabledAddBtn(false);
    if ((model) == null) {
        return OUTCOME_ERROR;
    }
    java.lang.String retVal = OUTCOME_SUCCESS;
    org.oscm.internal.billingadapter.POBillingAdapter selectedBillingAdapter = getSelectedBillingAdapter();
    try {
        getBillingAdapterService().saveBillingAdapter(selectedBillingAdapter);
        updateAdapter(selectedBillingAdapter.getBillingIdentifier());
        ui.handle(org.oscm.ui.dialog.classic.billingadapter.INFO_ADAPTER_SAVED);
    } catch (org.oscm.internal.types.exception.SaaSApplicationException e) {
        ui.handleException(e);
        retVal = OUTCOME_ERROR;
    }
    model.setInitialized(false);
    getInitialize();
    return retVal;
}