@org.lab_manager.controller.ResponseBody
@org.lab_manager.controller.RequestMapping(value = "/orderEquip", method = RequestMethod.POST)
public java.lang.String orderEquipment(@org.lab_manager.controller.RequestParam(value = "assetName")
java.lang.String assetName, @org.lab_manager.controller.RequestParam(value = "number")
int num, @org.lab_manager.controller.RequestParam(value = "days")
int days, @org.lab_manager.controller.RequestParam(value = "applicant")
java.lang.String apllyer) {
    java.util.Map<java.lang.String, java.lang.Object> result = new java.util.HashMap<java.lang.String, java.lang.Object>();
    int flag = 0;
    if (equipService.addEquipOrder(assetName, num, "", ":", apllyer))
        flag = 1;
    
    result.put("status", flag);
    return com.alibaba.fastjson.JSON.toJSONString(result);
}