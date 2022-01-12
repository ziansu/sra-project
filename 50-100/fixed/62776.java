@org.lab_manager.controller.ResponseBody
@org.lab_manager.controller.RequestMapping(value = "/orderEquip", method = RequestMethod.POST)
public java.lang.String orderEquipment(@org.lab_manager.controller.RequestParam(value = "assetName")
java.lang.String assetName, @org.lab_manager.controller.RequestParam(value = "number")
java.lang.String num, @org.lab_manager.controller.RequestParam(value = "startTime")
java.lang.String startTime, @org.lab_manager.controller.RequestParam(value = "endTime")
java.lang.String endTime, @org.lab_manager.controller.RequestParam(value = "applicant")
java.lang.String apllyer) {
    java.util.Map<java.lang.String, java.lang.Object> result = new java.util.HashMap<java.lang.String, java.lang.Object>();
    int flag = 0;
    if (equipService.addEquipOrder(assetName, java.lang.Integer.parseInt(num), startTime, endTime, apllyer))
        flag = 1;
    
    result.put("status", flag);
    return com.alibaba.fastjson.JSON.toJSONString(result);
}