@com.ib.booking.basket.controller.RequestMapping(value = "/{basketId}/remove/{productId}", method = RequestMethod.DELETE)
org.springframework.http.ResponseEntity<com.ib.commercial.model.Basket> remove(@com.ib.booking.basket.controller.PathVariable
java.lang.Long basketId, @com.ib.booking.basket.controller.PathVariable
java.lang.Long productId) {
    log.debug(((("Basket #" + basketId) + " Add Product#") + productId));
    com.ib.commercial.model.Product product = productrepository.getProduct(productId);
    com.ib.commercial.model.Basket basket = basketRepository.get(basketId);
    basket.getProducts().remove(product);
    basketRepository.update(basket);
    return new org.springframework.http.ResponseEntity(basket, null, org.springframework.http.HttpStatus.OK);
}