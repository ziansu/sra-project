@com.netease.web.user.RequestMapping(value = "/createUser", method = RequestMethod.POST)
@com.netease.web.user.ResponseBody
public java.lang.String create(@com.netease.web.user.RequestBody
com.netease.model.User user) {
    if ((user.getAdmin()) == null) {
        user.setAdmin(0);
    }
    com.netease.commons.ApiResponse response = this.userService.createNewUser(user);
    return convertApiResponseToJSONString(response);
}