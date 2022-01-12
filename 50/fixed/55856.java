@com.ofo.rest.RequestMapping(value = "/removefromcart/{dishId}", method = RequestMethod.POST)
public java.lang.Long remoteFromCart(@com.ofo.rest.PathVariable
java.lang.Long dishId) {
    return restaurantService.removeFromCart(dishId);
}