protected int getAccountIdForAccountname(java.lang.String accountName) throws com.starbattle.accounts.manager.AccountException {
    com.starbattle.accounts.manager.impl.sql.SqlSelectStatement select = new com.starbattle.accounts.manager.impl.sql.SqlSelectStatement();
    try {
        select.select(AccountTable.ACCOUNT_ID);
        select.from(com.starbattle.accounts.manager.impl.tables.AccountTable.class);
        select.where(AccountTable.NAME);
        select.values(accountName);
        java.sql.ResultSet rs = select.execute(databaseControl);
        rs.next();
        return rs.getInt(1);
    } catch (java.sql.SQLException e) {
        throw new com.starbattle.accounts.manager.AccountException("Failed to get AccountId for Accountname.");
    }
}