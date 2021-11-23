@org.junit.Test
public void convertToLocalizedBillingResource() throws org.oscm.internal.types.exception.BillingApplicationException {
    org.oscm.billing.external.pricemodel.service.PriceModel externalPriceModel = createExternalPriceModel();
    java.util.List<org.oscm.domobjects.LocalizedBillingResource> resultList = externalPriceModelBean.convertToLocalizedBillingResource(externalPriceModel, null);
    org.junit.Assert.assertEquals(4, resultList.size());
}