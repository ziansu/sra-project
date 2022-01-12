public void updateBaugruppeBaugruppe(int id, int anzahl) {
    java.sql.Connection con = de.hdm.it04.server.db.DbConnection.connection();
    try {
        java.sql.Statement stmt = con.createStatement();
        stmt.executeUpdate((((("UPDATE baugruppeBaugruppe SET anzahl = '" + anzahl) + "' ") + " WHERE id=") + id));
    } catch (java.sql.SQLException e2) {
        e2.printStackTrace();
    }
}