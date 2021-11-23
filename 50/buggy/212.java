public static void add(javax.portlet.PortletRequest portletRequest, java.lang.Class<?> clazz, java.lang.Object value) {
    com.liferay.portal.kernel.servlet.SessionErrors.add(portletRequest.getPortletSession(false), clazz.getName(), value);
}