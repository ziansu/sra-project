@org.springframework.web.bind.annotation.RequestMapping(value = "/associate", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public com.whayer.wx.common.mvc.ResponseCondition associate(@org.springframework.web.bind.annotation.RequestBody
java.lang.String[] ids, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    com.whayer.wx.product.controller.Product2RoleController.log.info("Product2RoleController.associate()");
    com.whayer.wx.common.mvc.Box box = loadNewBox(request);
    java.lang.String role = box.$p("role");
    if ((isNullOrEmpty(ids)) || (isNullOrEmpty(role))) {
        getResponse(X.FALSE);
    }
    productService.associate(role, ids);
    return getResponse(X.TRUE);
}