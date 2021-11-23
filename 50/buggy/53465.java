@com.springstudy.springstudy.controller.RequestMapping(value = "/{id}", method = RequestMethod.GET)
@com.springstudy.springstudy.controller.ResponseBody
public com.springstudy.springstudy.model.User listById(@com.springstudy.springstudy.controller.PathVariable
java.lang.Long id) {
    return userService.list(id);
}