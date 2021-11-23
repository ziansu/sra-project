@org.apache.shiro.authz.annotation.RequiresGuest
@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST, value = "/login")
public model.ResultMap login(form.LoginForm form) {
    model.ResultMap result = new model.ResultMap();
    try {
        org.apache.shiro.subject.Subject subject = org.apache.shiro.SecurityUtils.getSubject();
        subject.login(new org.apache.shiro.authc.UsernamePasswordToken(form.getPhone(), ""));
    } catch (java.lang.Exception e) {
        logger.error(e.getMessage());
        result.setStatus(ResultMap.STATUS_FAILURE);
        result.setInfo(e.getMessage());
        return result;
    }
    result.setStatus(ResultMap.STATUS_SUCCESS);
    return result;
}