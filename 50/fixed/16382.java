@java.lang.Override
public com.shop.model.ShoppingCartDTO findById(java.lang.Integer id) {
    com.shop.serviceimpl.ShoppingCartServiceImpl.LOGGER.debug("ShoppingCartServiceImpl:findById");
    org.springframework.util.Assert.notNull(id);
    com.shop.model.ShoppingCartDTO shoppingCart = shoppingCartDTOMapper.findById(id);
    return shoppingCart;
}