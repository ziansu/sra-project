@io.swagger.annotations.ApiOperation(value = "我的电池列表")
@com.immotor.controller.RequestMapping(value = "battery/list", method = RequestMethod.GET)
@com.immotor.controller.ResponseBody
public java.lang.Object getMyBattery(javax.servlet.http.HttpServletRequest httpServletRequest) {
    com.immotor.controller.UserInfo userInfo = com.immotor.utils.MyUtils.getUserByToken(httpServletRequest, userInfoRepository);
    java.util.List<com.immotor.controller.Battery> list = batteryRepository.findBatteriesByOwnerIdEqualsAndStatusEquals(userInfo.getId(), 1);
    if ((list == null) || (list.isEmpty())) {
        return new com.immotor.config.ResultMsg(ResultStatusCode.RETURN_CODE_NULL.getCode(), ResultStatusCode.RETURN_CODE_NULL.getMsg(), null);
    }
    return new com.immotor.config.ResultMsg(ResultStatusCode.OK.getCode(), ResultStatusCode.OK.getMsg(), list);
}