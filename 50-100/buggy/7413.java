protected java.lang.String getDisplayNameForAccountID(int accountID) throws com.starbattle.accounts.manager.AccountException {
    com.starbattle.accounts.manager.impl.sql.SqlSelectStatement select = new com.starbattle.accounts.manager.impl.sql.SqlSelectStatement();
    try {
        select.select(PlayerTable.NAME);
        select.from(com.starbattle.accounts.manager.impl.tables.PlayerTable.class);
        select.where(PlayerTable.ACCOUNT_ID);
        select.values(accountID);
        java.sql.ResultSet rs = select.execute(databaseControl);
        rs.next();
        return rs.getNString(1);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        throw new com.starbattle.accounts.manager.AccountException("Failed to get Displayname for AccountId.");
    }
}