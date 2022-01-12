public int insertProject(com.ctrip.platform.dal.daogen.entity.Project project) throws java.sql.SQLException {
    if (null == project)
        return 0;
    
    com.ctrip.platform.dal.dao.KeyHolder keyHolder = null;
    com.ctrip.platform.dal.dao.DalHints hints = com.ctrip.platform.dal.dao.DalHints.createIfAbsent(null);
    client.insert(hints, keyHolder, project);
    return keyHolder.getKey().intValue();
}