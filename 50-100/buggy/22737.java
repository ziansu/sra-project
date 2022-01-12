@org.springframework.web.bind.annotation.RequestMapping(value = "/login")
@org.springframework.web.bind.annotation.ResponseBody
public com.assistant.models.result.BaseServiceResult login(javax.servlet.http.HttpServletRequest re, javax.servlet.http.HttpServletResponse response, java.lang.String loginAccount) {
    com.assistant.models.result.BaseServiceResult result = new com.assistant.models.result.BaseServiceResult();
    com.assistant.db.model.SaySomething saySomething = saySomethingService.getSomethingByTrigger(loginAccount);
    if (saySomething == null) {
        com.assistant.utils.ResultHelper.fillFailure(result, ErrorMessageEnum.LOGIN_FAIL);
    }
    re.getSession().setAttribute("user", "user");
    return result;
}