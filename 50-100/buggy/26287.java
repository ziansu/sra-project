@java.lang.Override
public java.lang.Integer update(com.shop.model.ShoppingCartDTO cartDTO) {
    com.shop.serviceimpl.ShoppingCartServiceImpl.LOGGER.debug("ShoppingCartServiceImpl:update");
    org.springframework.util.Assert.notNull(cartDTO);
    org.springframework.util.Assert.notNull(cartDTO.getId());
    com.shop.model.ShoppingCart cart = convertToUpShoppingCart(cartDTO);
    calculatePrice(cart);
    java.lang.System.out.println(cart);
    shoppingCartMapper.update(cart);
    return cart.getId();
}