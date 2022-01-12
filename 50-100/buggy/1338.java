@myddl.controller.RequestMapping(value = "/{userId}", method = RequestMethod.POST)
@myddl.controller.ResponseBody
public java.lang.Object modifyUser(@myddl.controller.PathVariable(value = "userId")
java.lang.Long userId, @myddl.controller.RequestParam(value = "password", required = false)
java.lang.String password, @myddl.controller.RequestParam(value = "userName", required = false)
java.lang.String userName, @myddl.controller.RequestParam(value = "userImage", required = false)
java.lang.String userImage, @myddl.controller.RequestParam(value = "userPhone", required = false)
java.lang.String userPhone, @myddl.controller.RequestParam(value = "userEmail", required = false)
java.lang.String userEmail, @myddl.controller.RequestParam(value = "mainScreenImage", required = false)
java.lang.Integer mainScreenImage) {
    userService.modifyUser(new myddl.entity.UserPassword(null, null, password), new myddl.entity.UserInfo(userId, userName, userImage, userPhone, userEmail, mainScreenImage));
    return myddl.returnobject.ReturnObject.EXECUTION_SUCCESS;
}