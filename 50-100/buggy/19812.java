public void deleteAccount(int account_id) {
    java.sql.Statement stmt = null;
    try {
        stmt = connection.createStatement();
        stmt.execute(("DELETE FROM accounts WHERE account_id=" + account_id));
        java.lang.System.out.println("Account Deleted in DATABASE");
    } catch (java.lang.Exception exc) {
        java.lang.System.out.println("failure in deleting accoutn in accountDAO");
    }
}