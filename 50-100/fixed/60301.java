@org.springframework.web.bind.annotation.RequestMapping(value = "delete")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String delete(com.kk.model.User admin, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, @org.springframework.web.bind.annotation.RequestParam(value = "id")
int id) {
    com.kk.model.User user = userService.getUser(id);
    if (user == null) {
        return com.kk.utils.JsonUtil.getJson(1, "用户不存在").toString();
    }
    user.setStatus(1);
    userService.updateUser(user);
    return com.kk.utils.JsonUtil.getOkJson().toString();
}