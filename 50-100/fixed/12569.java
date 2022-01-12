@java.lang.Override
public ru.itis.inform.department.dao.models.User mapRow(java.sql.ResultSet resultSet, int i) throws java.sql.SQLException {
    try {
        return new ru.itis.inform.department.dao.models.User(resultSet.getInt("id"), resultSet.getString("username"), resultSet.getString("email"), resultSet.getString("city"), resultSet.getString("age"), resultSet.getString("gender"), resultSet.getString("passportData"), resultSet.getString("snils"));
    } catch (java.sql.SQLException e) {
        throw new java.lang.IllegalArgumentException(e);
    }
}