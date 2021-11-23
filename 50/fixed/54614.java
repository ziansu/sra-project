private void v1ToV2(java.sql.Statement stmt) throws java.sql.SQLException {
    stmt.executeUpdate(AbstractDb.ADD_HD_ACCOUNT_ID_FOR_OUTS);
    stmt.executeUpdate(AbstractDb.CREATE_TX_BLOCK_NO_INDEX);
    stmt.executeUpdate(AbstractDb.CREATE_OUT_OUT_ADDRESS_INDEX);
    stmt.executeUpdate(AbstractDb.CREATE_IN_PREV_TX_HASH_INDEX);
    createHDAccountAddress(stmt);
}