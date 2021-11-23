@org.junit.Test
public void findById() throws java.lang.Exception {
    com.shop.serviceimpl.ShoppingCartServiceImplTest.LOGGER.debug("ShoppingCartServiceImpl test: findById");
    com.shop.model.ShoppingCartDTO shoppingCart = shoppingCartService.findById(com.shop.serviceimpl.ShoppingCartServiceImplTest.ID);
    java.lang.System.out.println(shoppingCart);
    org.junit.Assert.assertEquals(com.shop.serviceimpl.ShoppingCartServiceImplTest.ID, shoppingCart.getId());
}