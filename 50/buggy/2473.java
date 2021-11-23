@io.swagger.annotations.ApiOperation(value = "客户端-机器人赔率列表")
@com.racing.controller.user.RequestMapping(value = "/robot/rate", method = RequestMethod.GET)
public java.lang.Object robotRate(@com.racing.controller.user.RequestParam(required = false, defaultValue = "1")
java.lang.Integer page) {
    java.lang.Integer userId = com.racing.util.LoginStatusSaveUtil.getUserClientId();
    return wechatClientService.select(userId, page);
}