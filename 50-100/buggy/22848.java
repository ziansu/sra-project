public void storeTransaction(com.revature.pojos.Account account, double amount, int type) {
    java.lang.System.out.println("Storing Transaction");
    try (java.sql.Connection conn = com.revature.util.ConnectionUtil.getConnection()) {
        java.sql.CallableStatement cs = conn.prepareCall("{call store_transaction(?,?, ?)}");
        cs.setInt(1, account.getBaid());
        cs.setInt(2, 1);
        cs.setDouble(3, amount);
        cs.executeUpdate();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}