@com.ofo.rest.RequestMapping(value = "/remotefromcart/{dishId}", method = RequestMethod.POST)
public void remoteFromCart(@com.ofo.rest.PathVariable
java.lang.Long dishId) {
    restaurantService.removeFromCart(dishId);
}