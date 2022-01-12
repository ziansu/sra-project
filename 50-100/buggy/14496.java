public void updateConfirmOrder(java.lang.String orderID) {
    try {
        java.sql.Connection conn = java.sql.DriverManager.getConnection(url, system.dbManager.username, system.dbManager.password);
        java.sql.Statement s = conn.createStatement();
        java.lang.String updateQuery = ("UPDATE stockorder SET status='Delievered' WHERE stockOrderID ='" + orderID) + "'";
        s.execute(updateQuery);
        java.sql.PreparedStatement preparedStmt = conn.prepareStatement(updateQuery);
        preparedStmt.executeUpdate();
        s.close();
        conn.close();
    } catch (java.sql.SQLException exp) {
        java.lang.System.out.println(exp);
    }
}