public void deleteOrder(int ID) {
    try {
        java.lang.String deleteString = "DELETE FROM OrderLines WHERE OrderID=" + ID;
        java.lang.System.out.println(deleteString);
        this.executeUpdate(conn, deleteString);
        java.lang.System.out.println("OrderLines delete successful");
        deleteString = "DELETE FROM Orders WHERE OrderID=" + ID;
        java.lang.System.out.println(deleteString);
        this.executeUpdate(conn, deleteString);
        java.lang.System.out.println("Delete successful");
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println("[ERROR: Could not delete to the table]");
        e.printStackTrace();
        return ;
    }
}