@org.springframework.web.bind.annotation.ResponseBody
@org.springframework.web.bind.annotation.RequestMapping(value = "/{shopId}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.util.Map<java.lang.String, java.lang.Object> getEquCheckByShopId(@org.springframework.web.bind.annotation.PathVariable
java.lang.String shopId) {
    java.util.List<cn.springmvc.model.EquCheck> lists = null;
    try {
        lists = equCheckService.getEquCheckListByShopId(shopId);
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        return com.springmvc.utils.HttpUtils.generateResponse("1", "服务器内部错误", null);
    }
    return com.springmvc.utils.HttpUtils.generateResponse("1", "请求成功", lists);
}