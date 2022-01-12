@java.lang.Override
public org.silverpeas.components.projectmanager.model.TaskDetail getMostDistantTask(java.lang.String instanceId, int taskId) {
    java.sql.Connection con = getConnection();
    try {
        return org.silverpeas.components.projectmanager.model.ProjectManagerDAO.getMostDistantTask(con, instanceId, taskId);
    } catch (java.lang.Exception re) {
        throw new org.silverpeas.components.projectmanager.model.ProjectManagerRuntimeException("DefaultProjectManagerService.getMostDistantTask()", org.silverpeas.core.exception.SilverpeasRuntimeException.ERROR, "projectManager.GETTING_TASK_FAILED", ("taskId = " + taskId), re);
    } finally {
        org.silverpeas.core.persistence.jdbc.DBUtil.close(con);
    }
}