@org.junit.Test
public void priceVendorCanNotBeNull() {
    orderPosition.setPriceVendor(null);
    validator.validate(orderPosition, errors);
    org.junit.Assert.assertEquals("NotNull", errors.getFieldError("priceVendor").getCode());
}