public static double getDouble(javax.servlet.http.HttpServletRequest request, java.lang.String param, double defaultValue, java.util.Locale locale) {
    return com.liferay.portal.kernel.util.GetterUtil.get(request.getParameter(param), defaultValue, locale);
}