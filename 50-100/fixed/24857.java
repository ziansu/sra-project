private static org.silverpeas.components.projectmanager.model.TaskResourceDetail getTaskResourceDetailFromResultset(java.sql.ResultSet rs) throws java.sql.SQLException {
    int id = rs.getInt("id");
    int taskId = rs.getInt("taskId");
    java.lang.String userId = java.lang.Integer.toString(rs.getInt("resourceId"));
    int charge = rs.getInt("charge");
    java.lang.String instanceId = rs.getString("instanceId");
    return new org.silverpeas.components.projectmanager.model.TaskResourceDetail(id, taskId, userId, charge, instanceId);
}