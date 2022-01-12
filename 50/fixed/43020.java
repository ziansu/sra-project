@org.springframework.web.bind.annotation.RequestMapping(value = "/logout")
@org.springframework.web.bind.annotation.ResponseBody
public com.onesandzeros.models.BaseResponse<java.lang.String> logout(@org.springframework.web.bind.annotation.RequestBody
com.onesandzeros.model.register.LoginPayload loginPayload, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws com.onesandzeros.exceptions.ServiceException {
    com.onesandzeros.web.SSOAuthController.LOGGER.info("signup api : {}", loginPayload);
    return ssoService.logout(request, response);
}