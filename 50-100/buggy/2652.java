@org.junit.Test(expected = com.in28minutes.junit.business.exception.DifferentCurrenciesException.class)
public void testClientProductSum_DifferentCurrencies_ThrowsException() throws com.in28minutes.junit.business.exception.DifferentCurrenciesException {
    com.in28minutes.junit.model.Amount[] amounts = new com.in28minutes.junit.model.Amount[]{ new com.in28minutes.junit.model.AmountImpl(new java.math.BigDecimal("5.0"), com.in28minutes.junit.model.Currency.EURO) , new com.in28minutes.junit.model.AmountImpl(new java.math.BigDecimal("6.0"), com.in28minutes.junit.model.Currency.INDIAN_RUPEE) };
    java.util.List<com.in28minutes.junit.model.Product> products = createProductListWithAmounts(amounts);
    @java.lang.SuppressWarnings(value = "unused")
    com.in28minutes.junit.model.Amount actual = clientBO.getClientProductsSum(products);
}