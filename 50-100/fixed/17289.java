public void updateDescriptionByID(int ID, java.lang.String newDescription) {
    try {
        java.lang.String newDescriptionString = (("UPDATE Inventory SET ItemDescription='" + newDescription) + "' WHERE ItemID=") + ID;
        java.lang.System.out.println(newDescriptionString);
        this.executeUpdate(Inventory.conn, newDescriptionString);
        java.lang.System.out.println("Update description successful");
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println("[ERROR: Could not update description.]");
        e.printStackTrace();
        return ;
    }
}