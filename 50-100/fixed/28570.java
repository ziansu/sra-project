public void addPosition(org.traccar.model.Position position) throws java.sql.SQLException {
    position.setId(org.traccar.database.QueryBuilder.create(dataSource, getQuery("database.insertPosition"), true).setObject(position).setDate("time", position.getFixTime()).setLong("device_id", position.getDeviceId()).setLong("power", 0).setString("extended_info", position.getOther()).executeUpdate());
}