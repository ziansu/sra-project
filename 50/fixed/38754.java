@java.lang.Override
public java.lang.String submitPlannings(java.lang.String sessionId, javax.ws.rs.core.PathSegment pathSegment, java.util.Map<java.lang.String, java.lang.String> jobContentXmlString) throws java.io.IOException, org.ow2.proactive_grid_cloud_portal.scheduler.exception.JobCreationRestException, org.ow2.proactive_grid_cloud_portal.scheduler.exception.NotConnectedRestException, org.ow2.proactive_grid_cloud_portal.scheduler.exception.PermissionRestException, org.ow2.proactive_grid_cloud_portal.scheduler.exception.SubmissionClosedRestException {
    return scheduler().submitPlannings(sessionId, pathSegment, jobContentXmlString);
}