public static double getDouble(javax.portlet.PortletRequest portletRequest, java.lang.String param, java.util.Locale locale, double defaultValue) {
    return com.liferay.portal.kernel.util.GetterUtil.getDouble(portletRequest.getParameter(param), locale);
}