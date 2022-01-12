public void redirectToAdd(javax.portlet.ActionRequest actionRequest, javax.portlet.ActionResponse actionResponse) throws com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException {
    long documentId = com.liferay.portal.kernel.util.ParamUtil.getLong(actionRequest, "documentId");
    com.rknowsys.eapp.hrm.model.Documents documentObject = com.rknowsys.eapp.hrm.service.DocumentsLocalServiceUtil.getDocuments(documentId);
    javax.portlet.PortletSession portletSession = actionRequest.getPortletSession();
    portletSession.setAttribute("editDocument", documentObject);
    actionResponse.setRenderParameter("mvcPath", "/html/documents/editdocuments.jsp");
}