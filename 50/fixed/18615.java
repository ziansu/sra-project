@org.junit.Test
public void priceVendorCanNotBeNull() {
    validator.validate(orderPosition, errors);
    org.junit.Assert.assertEquals("NotNull", errors.getFieldError("priceVendor").getCode());
}