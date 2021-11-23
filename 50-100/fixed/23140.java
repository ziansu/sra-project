public void processAction(javax.portlet.ActionRequest request, javax.portlet.ActionResponse actionResponse) throws java.io.IOException, javax.portlet.PortletException {
    switch (de.ingrid.portal.portlets.mdek.MdekAdminLoginPortlet.getAction(request)) {
        case IGE_LOGIN :
            processActionIgeLogin(request, actionResponse);
            break;
        default :
            de.ingrid.portal.portlets.mdek.MdekAdminLoginPortlet.log.warn("UNKNOWN ACTION in MdekAdminLoginPortlet");
            break;
    }
}