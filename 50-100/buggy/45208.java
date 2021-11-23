@org.springframework.web.bind.annotation.ResponseBody
@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.util.Map<java.lang.String, java.lang.Object> getEquCheckByShopId(@org.springframework.web.bind.annotation.PathVariable
java.lang.String shopId) {
    java.util.List<cn.springmvc.model.Equipment> lists = null;
    try {
        lists = equService.getAllEquipments();
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        return com.springmvc.utils.HttpUtils.generateResponse("1", "服务器内部错误", null);
    }
    return com.springmvc.utils.HttpUtils.generateResponse("0", "请求成功", lists);
}