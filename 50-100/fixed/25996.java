@org.junit.Test
public void getValueTest() throws java.lang.Exception {
    model.taxes.ImportedGoodTax importedGoodTax = new model.taxes.ImportedGoodTax();
    java.math.BigDecimal expected = model.taxes.ImportedGoodTaxTest.DUMMY_PRICE.multiply(importedGoodTax.getPercentage()).divide(new java.math.BigDecimal(100));
    org.junit.Assert.assertEquals(expected, importedGoodTax.getValue(model.taxes.ImportedGoodTaxTest.DUMMY_PRICE));
}