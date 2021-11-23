@com.emusicstore.controller.RequestMapping(value = "/{cartId}", method = RequestMethod.GET)
@com.emusicstore.controller.ResponseBody
public com.emusicstore.model.Cart read(@com.emusicstore.controller.PathVariable(value = "cartId")
java.lang.Long cartId) {
    return cartDao.read(cartId);
}