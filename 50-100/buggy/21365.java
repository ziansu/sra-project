private static void forwardToConfirmForm(final password.pwm.http.PwmRequest pwmRequest, final password.pwm.config.profile.UpdateAttributesProfile updateAttributesProfile, final password.pwm.http.bean.UpdateProfileBean updateProfileBean) throws java.io.IOException, javax.servlet.ServletException, password.pwm.error.PwmUnrecoverableException {
    final java.util.List<password.pwm.config.value.data.FormConfiguration> form = updateAttributesProfile.readSettingAsForm(PwmSetting.UPDATE_PROFILE_FORM);
    final java.util.Map<password.pwm.config.value.data.FormConfiguration, java.lang.String> formValueMap = password.pwm.http.servlet.UpdateProfileServlet.formMapFromBean(updateAttributesProfile, updateProfileBean);
    pwmRequest.addFormInfoToRequestAttr(form, formValueMap, true, false);
    final java.util.List<password.pwm.config.value.data.FormConfiguration> links = updateAttributesProfile.readSettingAsForm(PwmSetting.UPDATE_PROFILE_CUSTOMLINKS);
    pwmRequest.addFormInfoToRequestAttr(links);
    pwmRequest.forwardToJsp(JspUrl.UPDATE_ATTRIBUTES_CONFIRM);
}