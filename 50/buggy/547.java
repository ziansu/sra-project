public long addEntities(net.sf.jailer.datamodel.Table table, java.lang.String condition, int today, long limit) throws java.sql.SQLException {
    return addEntities(table, "T", condition, null, null, null, null, false, today, limit, 0, true);
}