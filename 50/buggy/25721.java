@com.emusicstore.controller.RequestMapping(value = "/{cartId}", method = RequestMethod.DELETE)
@com.emusicstore.controller.ResponseStatus(value = org.springframework.http.HttpStatus.NO_CONTENT)
public void delete(@com.emusicstore.controller.PathVariable(value = "cartId")
java.lang.Long cartId) {
    cartDao.delete(cartId);
}