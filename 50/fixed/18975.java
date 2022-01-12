public static double getDouble(javax.portlet.PortletRequest portletRequest, java.lang.String param, double defaultValue, java.util.Locale locale) {
    return com.liferay.portal.kernel.util.GetterUtil.get(portletRequest.getParameter(param), defaultValue, locale);
}