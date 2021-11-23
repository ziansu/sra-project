@java.lang.Override
public void remove(int id) {
    try {
        java.lang.String query = "DELETE FROM suppliers WHERE id = ?";
        java.sql.Connection connection = getConnection();
        java.sql.PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1, id);
        stmt.executeQuery();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        java.lang.System.out.println("Could not remove supplier from database.");
    }
}