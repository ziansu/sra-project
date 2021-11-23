@org.springframework.web.bind.annotation.RequestMapping(value = "/oauth/custom/register/empty.json", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public org.orcid.pojo.ajaxForm.OauthRegistrationForm getRegister(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    if ((request.getSession().getAttribute(RegistrationController.GRECAPTCHA_SESSION_ATTRIBUTE_NAME)) != null) {
        request.getSession().removeAttribute(RegistrationController.GRECAPTCHA_SESSION_ATTRIBUTE_NAME);
    }
    org.orcid.pojo.ajaxForm.OauthRegistrationForm empty = new org.orcid.pojo.ajaxForm.OauthRegistrationForm(registrationController.getRegister(request, response, false));
    empty.setCreationType(org.orcid.pojo.ajaxForm.Text.valueOf(CreationMethod.MEMBER_REFERRED.value()));
    org.orcid.pojo.ajaxForm.Text emptyText = org.orcid.pojo.ajaxForm.Text.valueOf(StringUtils.EMPTY);
    empty.setPassword(emptyText);
    return empty;
}