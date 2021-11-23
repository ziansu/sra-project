@org.springframework.web.bind.annotation.RequestMapping(value = "/getListByType")
public com.whayer.wx.common.mvc.ResponseCondition getListByType(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException {
    com.whayer.wx.login.controller.LoginController.log.info("LoginController.getListByType()");
    com.whayer.wx.common.mvc.Box box = loadNewBox(request);
    java.lang.Integer type = null;
    java.lang.String u = box.$p(X.USER_TYPE);
    if (isNullOrEmpty(u)) {
        type = null;
    }else {
        java.lang.Integer.parseInt(u);
    }
    com.github.pagehelper.PageInfo<com.whayer.wx.login.vo.SkUser> pi = userService.getUserListByType(type, box.getPagination());
    return pagerResponse(pi);
}