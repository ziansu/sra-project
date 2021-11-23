public static javax.mail.internet.InternetAddress getAdminFromEmailAddress() throws com.liferay.portal.kernel.exception.SystemException, java.io.UnsupportedEncodingException {
    try {
        final java.lang.String adminFromEmail = com.ext.portlet.service.ConfigurationAttributeLocalServiceUtil.getAttributeStringValue(ConfigurationAttributeKey.ADMIN_FROM_EMAIL, 0L);
        return new javax.mail.internet.InternetAddress(adminFromEmail, org.xcolab.utils.TemplateReplacementUtil.replacePlatformConstants("The <colab-name/> Team"));
    } catch (com.ext.portlet.NoSuchConfigurationAttributeException e) {
        throw new com.liferay.portal.kernel.exception.SystemException("Admin email not configured in ConfigurationAttribute table", e);
    }
}