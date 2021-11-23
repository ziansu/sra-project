public void addDevice(org.traccar.model.Device device) throws java.sql.SQLException {
    device.setId(org.traccar.database.QueryBuilder.create(dataSource, getQuery("database.insertDevice")).setObject(device).executeUpdate());
}