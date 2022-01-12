public void deleteUser(int ID) {
    try {
        java.lang.String deleteString = ("DELETE FROM Users WHERE idUsers=" + ID) + ";";
        java.lang.System.out.println(deleteString);
        this.executeUpdate(conn, deleteString);
        java.lang.System.out.println("Users delete successful");
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println("[ERROR: Could not delete from the table]");
        e.printStackTrace();
        return ;
    }
}