@com.xjtulpar.rest.RequestMapping(value = "update.do", method = RequestMethod.POST, consumes = "application/json")
@com.xjtulpar.rest.ResponseBody
public java.lang.Object updateManager(@com.xjtulpar.rest.RequestBody
com.xjtulpar.entity.Battery battery) {
    java.util.Map<java.lang.String, java.lang.Object> resultMap = new java.util.HashMap<java.lang.String, java.lang.Object>();
    batteryService.updateBattery(battery);
    resultMap.put("code", 0);
    resultMap.put("msg", "successful");
    resultMap.put("data", null);
    return resultMap;
}