@com.springstudy.springstudy.controller.RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
public com.springstudy.springstudy.model.User list(@com.springstudy.springstudy.controller.PathVariable
java.lang.Long id) {
    return userService.list(id);
}