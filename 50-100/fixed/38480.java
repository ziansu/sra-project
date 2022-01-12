public void upload(org.oscm.internal.vo.VOServiceDetails service) {
    try {
        org.oscm.billing.external.pricemodel.service.PriceModel priceModel = getExternalPriceModelService().getExternalPriceModelForService(service);
        if (priceModel == null) {
            throw new org.oscm.internal.pricemodel.external.ExternalPriceModelException();
        }
        loadPriceModelContent(priceModel);
        addMessage(null, FacesMessage.SEVERITY_INFO, org.oscm.ui.dialog.classic.pricemodel.external.INFO_EXTERNAL_PRICE_UPLOADED);
    } catch (org.oscm.internal.pricemodel.external.ExternalPriceModelException e) {
        addMessage(null, FacesMessage.SEVERITY_ERROR, org.oscm.ui.dialog.classic.pricemodel.external.ERROR_EXTERNAL_PRICEMODEL_NOT_AVAILABLE);
    }
}