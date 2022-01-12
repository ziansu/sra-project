@java.lang.Override
public beans.AppointmentBean mapRow(java.sql.ResultSet resultSet, int row) throws java.sql.SQLException {
    beans.AppointmentBean appointment = new beans.AppointmentBean();
    appointment.setDescription(resultSet.getString("description"));
    appointment.setDoctors_username(resultSet.getString("doctors_username"));
    appointment.setExpectedDate(resultSet.getDate("expectedDate"));
    appointment.setRequestedDate(resultSet.getDate("requestedDate"));
    appointment.setStatus(resultSet.getString("status"));
    appointment.setWelcomeDate(resultSet.getDate("welcomeDate"));
    return appointment;
}