@org.junit.Test
public void testCreateRateFileSearchFilterForQueryForFullCustomer() {
    com.moorkensam.xlra.model.customer.Customer fc = new com.moorkensam.xlra.model.customer.Customer();
    fc.setName("basfull");
    fc.setHasOwnRateFile(true);
    quotationQuery.setCustomer(fc);
    com.moorkensam.xlra.model.rate.RateFileSearchFilter filter = quotationUtil.createRateFileSearchFilterForQuery(quotationQuery, false);
    junit.framework.Assert.assertNotNull(filter);
    junit.framework.Assert.assertEquals(filter.getCustomer(), fc);
}