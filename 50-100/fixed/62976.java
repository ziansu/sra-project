public void updatePickedByID(int ID, int newPicked) {
    try {
        java.lang.String newPickedString = (("UPDATE Inventory SET PickedCount=" + newPicked) + " WHERE ItemID=") + ID;
        java.lang.System.out.println(newPickedString);
        this.executeUpdate(Inventory.conn, newPickedString);
        java.lang.System.out.println("Update picked successful");
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println("[ERROR: Could not update picked.]");
        e.printStackTrace();
        return ;
    }
}