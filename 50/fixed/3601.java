@com.arr.rsoi.controller.RequestMapping(value = "/me", method = RequestMethod.GET)
@com.arr.rsoi.controller.ResponseBody
public java.lang.String userInfo(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, java.net.URISyntaxException {
    if (!(com.arr.rsoi.service.RestHelper.checkLogin(request, response))) {
        return null;
    }
    return applicationService.isLogin().toString();
}