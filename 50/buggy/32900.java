@com.qim.controller.RequestMapping(value = "/updateUser")
@com.qim.controller.ResponseBody
public void updateUser(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    java.lang.String[] userStr = request.getParameterValues("user");
    com.qim.entity.User user = ((com.qim.entity.User) (com.qim.utils.JSONUtil.jsonToBean(userStr, com.qim.entity.User.class)));
    java.lang.System.out.println(userStr);
}