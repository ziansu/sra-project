@org.etan.portal.integration.createprojectportlet.portlet.ProcessAction(name = "createProject")
public void createProject(org.etan.portal.integration.createprojectportlet.portlet.ActionRequest actionRequest, org.etan.portal.integration.createprojectportlet.portlet.ActionResponse actionResponse) {
    java.lang.String projectName = actionRequest.getParameter("projectName");
    com.liferay.portal.kernel.service.ServiceContext serviceContext = null;
    try {
        serviceContext = com.liferay.portal.kernel.service.ServiceContextFactory.getInstance(actionRequest);
    } catch (com.liferay.portal.kernel.exception.PortalException e) {
        org.etan.portal.integration.createprojectportlet.portlet.CreateProjectPortlet.logger.warn(e);
    }
    org.etan.portal.integration.projectcontroller.service.dto.ProjectDto project = projectManage.createProject(projectName, serviceContext);
    actionRequest.setAttribute("createdProject", project);
}