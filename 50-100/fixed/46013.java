@java.lang.Override
public com.pluralsight.model.Ride mapRow(java.sql.ResultSet resultSet, int i) throws java.sql.SQLException {
    com.pluralsight.model.Ride ride = new com.pluralsight.model.Ride();
    ride.setId(resultSet.getInt("id"));
    ride.setName(resultSet.getString("name"));
    ride.setDuration(resultSet.getInt("duration"));
    return ride;
}