@java.lang.Override
public boolean checkPassword(int id, java.lang.String password) {
    try {
        com.ee47.ic.model.Student student = databaseController.findStudentById(id);
        return password.equals(student.getQueryPassword());
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        return false;
    }
}