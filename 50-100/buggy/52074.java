private void serveViewVendor(org.eclipse.sw360.portal.portlets.admin.ResourceRequest request, org.eclipse.sw360.portal.portlets.admin.ResourceResponse response) throws java.io.IOException, org.eclipse.sw360.portal.portlets.admin.PortletException {
    java.lang.String what = request.getParameter(PortalConstants.WHAT);
    java.lang.String where = request.getParameter(PortalConstants.WHERE);
    if ("vendor".equals(what)) {
        renderVendor(request, response, where);
    }else
        if ("vendorSearch".equals(what)) {
            renderVendorSearch(request, response, where);
        }
    
}