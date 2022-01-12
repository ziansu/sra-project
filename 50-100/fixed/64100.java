@com.controller.RequestMapping(value = "getToday")
public java.lang.String getToday(@com.controller.RequestBody(required = false)
java.lang.String mapString, org.springframework.ui.ModelMap model) throws java.lang.Exception {
    java.util.Map map = com.util.JSONUtil.parseMap(mapString);
    java.lang.String accountNumber = userService.getAccountNumber(model, map);
    if (accountNumber == null) {
        return com.util.JSONUtil.toJSON(map);
    }
    java.util.List list = measureService.findTodayDataByAccountNumber(accountNumber);
    return com.util.JSONUtil.toJSON(com.util.ListToMapUtil.ListToMap(list));
}