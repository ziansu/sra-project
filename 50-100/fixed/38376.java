@java.lang.Override
public com.bcbssc.post.dao.EventType getEventType(long EventTypeID) {
    java.lang.String sql = "SELECT * FROM eventtype LEFT JOIN communicationtemplate on EVENTTYPE_CTID = COMMUNICATIONTEMPLATE_ID WHERE EVENTTYPE_ID = ?";
    if (com.bcbssc.post.dao.MySQLPostDAO.log.isDebugEnabled())
        com.bcbssc.post.dao.MySQLPostDAO.log.debug(("sql = " + sql));
    
    java.util.List<com.bcbssc.post.dao.EventType> result = template.query(sql, new java.lang.Object[]{ EventTypeID }, new com.bcbssc.post.dao.EventTypeMapper());
    if ((result.size()) > 0) {
        return result.get(0);
    }else {
        return null;
    }
}