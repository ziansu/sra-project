@com.ofo.rest.RequestMapping(value = "/addtocart/{dishId}/{quantity}", method = RequestMethod.POST)
public void addToCart(@com.ofo.rest.PathVariable
java.lang.Long dishId, @com.ofo.rest.PathVariable
int quantity) {
    restaurantService.addToCart(dishId, quantity);
}