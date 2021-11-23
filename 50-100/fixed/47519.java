@java.lang.Override
public DAL.StudentDTO getStudent(int studentId) {
    try {
        java.sql.PreparedStatement stm = CONN.prepareStatement((("SELECT * FROM " + (DATABASE_NAME)) + "WHERE id = ?"));
        stm.setInt(1, studentId);
        java.sql.ResultSet result = stm.executeQuery();
        while (result.next())
            return new DAL.StudentDTO(result.getString("studentId"), result.getString("name"), result.getInt("status"));
        
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return null;
}