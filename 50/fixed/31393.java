@com.ofo.rest.RequestMapping(value = "/addtocart/{dishId}/{quantity}", method = RequestMethod.POST)
public java.lang.Long addToCart(@com.ofo.rest.PathVariable
java.lang.Long dishId, @com.ofo.rest.PathVariable
int quantity) {
    return restaurantService.addToCart(dishId, quantity);
}