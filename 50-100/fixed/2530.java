public com.j256.ormlite.dao.CloseableIterator<me.confuser.banmanager.data.PlayerWarnData> findWarnings(long fromTime) throws java.sql.SQLException {
    if (fromTime == 0) {
        return iterator();
    }
    long checkTime = fromTime + (me.confuser.banmanager.util.DateUtils.getTimeDiff());
    com.j256.ormlite.stmt.QueryBuilder<me.confuser.banmanager.data.PlayerWarnData, java.lang.Integer> query = queryBuilder();
    com.j256.ormlite.stmt.Where<me.confuser.banmanager.data.PlayerWarnData, java.lang.Integer> where = query.where();
    where.ge("created", checkTime);
    query.setWhere(where);
    return query.iterator();
}