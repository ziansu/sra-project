@com.monitor.controller.RequestMapping(value = "/e_queryDeviceStatus", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
@com.monitor.controller.ResponseBody
public java.util.List<com.monitor.model.DeviceStatus> queryStatus(@com.monitor.controller.RequestParam(value = "accountId", defaultValue = "0")
int accountId, @com.monitor.controller.RequestParam(value = "type", defaultValue = "0")
int type, javax.servlet.http.HttpServletResponse response) throws com.monitor.exception.CodeException {
    if (accountId == 0) {
        throw new com.monitor.exception.CodeException("请重新登录");
    }
    java.util.List<com.monitor.model.DeviceStatus> resultList = new java.util.ArrayList<com.monitor.model.DeviceStatus>();
    resultList = deviceService.queryDeviceStatus();
    return resultList;
}