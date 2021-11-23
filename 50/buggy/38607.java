@org.apache.shiro.authz.annotation.RequiresPermissions(value = "arsenal:stock:view")
@com.bjsts.manager.controller.purchase.RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
public java.lang.String view(@com.bjsts.manager.controller.purchase.PathVariable
java.lang.Long id, org.springframework.ui.ModelMap modelMap) {
    modelMap.put("stock", stockService.get().get(id));
    return "stock/view";
}