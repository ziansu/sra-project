public long addEntities(net.sf.jailer.datamodel.Table table, java.lang.String condition, int today) throws java.sql.SQLException {
    return addEntities(table, "T", condition, null, null, null, null, false, today, 0, true);
}