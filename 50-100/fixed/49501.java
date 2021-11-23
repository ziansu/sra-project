public java.util.List<com.ctrip.platform.dal.daogen.entity.GenTaskBySqlBuilder> updateAndGetAllTasks(int projectId) throws java.sql.SQLException {
    java.util.List<com.ctrip.platform.dal.daogen.entity.GenTaskBySqlBuilder> result = new java.util.ArrayList<>();
    java.util.List<com.ctrip.platform.dal.daogen.entity.GenTaskBySqlBuilder> list = getTasksByProjectId(projectId);
    if ((list == null) || ((list.size()) == 0))
        return result;
    
    for (com.ctrip.platform.dal.daogen.entity.GenTaskBySqlBuilder entity : list) {
        entity.setGenerated(true);
        result.add(entity);
    }
    return result;
}