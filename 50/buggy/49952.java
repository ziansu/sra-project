@org.junit.Test
public void createLocalizedBillingResources() throws org.oscm.internal.types.exception.BillingApplicationException {
    org.oscm.billing.external.pricemodel.service.PriceModel priceModel = createExternalPriceModel();
    java.util.List<org.oscm.domobjects.LocalizedBillingResource> resultList = org.oscm.billing.application.bean.LocalizedBillingResourceAssembler.createLocalizedBillingResources(priceModel);
    org.junit.Assert.assertEquals(4, resultList.size());
}