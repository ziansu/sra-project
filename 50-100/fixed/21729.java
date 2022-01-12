@org.junit.Test
public void theUserReceivesAProductThenTheAmountOfExchangedProductsIsIncrementedByOne() {
    unq.tpi.desapp.grupof.model.Product product = mock(unq.tpi.desapp.grupof.model.Product.class);
    unq.tpi.desapp.grupof.model.User anUser = new unq.tpi.desapp.grupof.model.builder.UserPassengerBuilder().build();
    anUser.receiveProduct(product);
    org.junit.Assert.assertEquals(1, anUser.getExchangedProducts().size());
}