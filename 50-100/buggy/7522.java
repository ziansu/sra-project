@java.lang.Override
public void processAction(javax.portlet.PortletConfig portletConfig, javax.portlet.ActionRequest actionRequest, javax.portlet.ActionResponse actionResponse) throws java.lang.Exception {
    int status = com.liferay.portal.kernel.util.ParamUtil.getInteger(actionRequest, "status");
    java.lang.String portletResource = com.liferay.portal.kernel.util.ParamUtil.getString(actionRequest, "portletResource");
    javax.portlet.PortletPreferences preferences = com.liferay.portlet.PortletPreferencesFactoryUtil.getPortletSetup(actionRequest, portletResource);
    preferences.setValue("status", java.lang.String.valueOf(status));
    preferences.store();
    com.liferay.portal.kernel.servlet.SessionMessages.add(actionRequest, "potlet-config-saved");
}