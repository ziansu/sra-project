private static de.ingrid.portal.portlets.mdek.MdekAdminLoginPortlet.ACTION getAction(javax.portlet.ActionRequest request) {
    if ((request.getParameter(de.ingrid.portal.portlets.mdek.MdekAdminLoginPortlet.PARAMV_ACTION_DO_LOGIN_ADMIN)) != null)
        return de.ingrid.portal.portlets.mdek.MdekAdminLoginPortlet.ACTION.ADMIN_LOGIN;
    else
        if ((request.getParameter(de.ingrid.portal.portlets.mdek.MdekAdminLoginPortlet.PARAMV_ACTION_DO_LOGIN_IGE)) != null)
            return de.ingrid.portal.portlets.mdek.MdekAdminLoginPortlet.ACTION.IGE_LOGIN;
        else
            return de.ingrid.portal.portlets.mdek.MdekAdminLoginPortlet.ACTION.UNKNOWN;
        
    
}