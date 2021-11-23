public void processAction(com.liferay.portal.kernel.struts.StrutsPortletAction originalStrutsPortletAction, javax.portlet.PortletConfig portletConfig, javax.portlet.ActionRequest actionRequest, javax.portlet.ActionResponse actionResponse) throws java.lang.Exception {
    long layoutSetPrototypeId = com.liferay.portal.kernel.util.ParamUtil.getLong(actionRequest, PARAM_ID, INVALID_ID);
    com.liferay.portal.service.ServiceContext serviceContext = com.liferay.portal.service.ServiceContextFactory.getInstance(com.liferay.portal.model.LayoutSetPrototype.class.getName(), actionRequest);
    if (layoutSetPrototypeId > 0) {
        com.liferay.portal.model.LayoutSetPrototype layoutSetPrototype = com.liferay.portal.service.LayoutSetPrototypeLocalServiceUtil.getLayoutSetPrototype(layoutSetPrototypeId);
        layoutSetPrototype.setExpandoBridgeAttributes(serviceContext);
        com.liferay.portal.service.LayoutSetPrototypeLocalServiceUtil.updateLayoutSetPrototype(layoutSetPrototype);
    }
    originalStrutsPortletAction.processAction(originalStrutsPortletAction, portletConfig, actionRequest, actionResponse);
}