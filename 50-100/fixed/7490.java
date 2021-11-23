private void processProject(com.ctrip.platform.dal.daogen.entity.Project entity) throws java.sql.SQLException {
    entity.setText(entity.getName());
    entity.setChildren(false);
    entity.setIcon("glyphicon glyphicon-tasks");
    if ((entity.getUpdate_time()) == null)
        return ;
    
    java.sql.Date date = new java.sql.Date(entity.getUpdate_time().getTime());
    entity.setStr_update_time(new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));
}