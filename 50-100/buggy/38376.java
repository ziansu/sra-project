@java.lang.Override
public com.bcbssc.post.dao.EventType getEventType(long EventTypeID) {
    java.lang.String sql = "SELECT * FROM eventtype LEFT JOIN communicationtemplate on EVENTTYPE_CTID = COMMUNICATIONTEMPLATE_ID WHERE EVENTTYPE_ID = ?";
    if (com.bcbssc.post.dao.MySQLPostDAO.log.isDebugEnabled())
        com.bcbssc.post.dao.MySQLPostDAO.log.debug(("sql = " + sql));
    
    return template.queryForObject(sql, new java.lang.Object[]{ EventTypeID }, new com.bcbssc.post.dao.EventTypeMapper());
}