public java.sql.ResultSet getLineItems(long invoicenumber) {
    java.sql.Connection conn = dbms.DatabaseManager.getConnection();
    try {
        java.sql.PreparedStatement ps = conn.prepareStatement("SELECT fee,itemtype FROM lineitems WHERE invoicenumber=?");
        ps.setLong(0, invoicenumber);
        return ps.executeQuery();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            conn.close();
        } catch (java.sql.SQLException e) {
            java.lang.System.err.println("Error closing connections");
            e.printStackTrace();
        }
    }
    return null;
}