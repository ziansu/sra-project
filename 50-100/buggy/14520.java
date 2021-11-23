private void processDatabaseSetEntry(com.ctrip.platform.dal.daogen.entity.DatabaseSetEntry entity) throws java.sql.SQLException {
    if ((entity.getUpdate_time()) == null)
        return ;
    
    java.util.Date date = new java.util.Date(entity.getUpdate_time().getTime());
    entity.setStr_update_time(new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));
}