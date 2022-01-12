public void editDocument(javax.portlet.ActionRequest actionRequest, javax.portlet.ActionResponse actionResponse) throws com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException, java.io.IOException, java.lang.NumberFormatException, javax.portlet.PortletException {
    com.rknowsys.eapp.DocumentAction.log.info("inside editDocument() method......");
    java.lang.Long documentId = com.liferay.portal.kernel.util.ParamUtil.getLong(actionRequest, "documentId");
    com.rknowsys.eapp.hrm.model.Documents documents = com.rknowsys.eapp.hrm.service.DocumentsLocalServiceUtil.getDocuments(documentId);
    com.rknowsys.eapp.DocumentAction.log.info("11..");
    javax.portlet.PortletSession portletSession = actionRequest.getPortletSession();
    portletSession.setAttribute("editDocument", documents);
    com.rknowsys.eapp.DocumentAction.log.info("222...");
    actionResponse.setRenderParameter("mvcPath", "/html/documents/editdocuments.jsp");
}