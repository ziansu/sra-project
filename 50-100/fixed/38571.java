public static java.lang.String getAbsoluteResetPasswordURL(com.liferay.portal.model.Company company, com.liferay.portal.model.User user, java.lang.String token, java.util.Locale locale, boolean fromAngular) {
    if (fromAngular) {
        return (com.dotcms.util.UrlUtil.getBaseURL(company)) + (com.dotcms.util.UrlUtil.ANGULAR_RESET_PASSWORD_URL_STRATEGY.getResetUserPasswordRelativeURL(user, token, locale, company));
    }else {
        return (com.dotcms.util.UrlUtil.getBaseURL(company)) + (com.dotcms.util.UrlUtil.DEFAULT_RESET_PASSWORD_URL_STRATEGY.getResetUserPasswordRelativeURL(user, token, locale, company));
    }
}