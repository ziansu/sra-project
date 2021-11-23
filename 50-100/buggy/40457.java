@java.lang.Override
public void setAddresses(java.lang.String[] addresses) {
    java.lang.String sql = ((((((net.sharkfw.knowledgeBase.persistent.sql.SqlSharkHelper.DELETE) + (net.sharkfw.knowledgeBase.persistent.sql.SqlSharkHelper.FROM)) + (net.sharkfw.knowledgeBase.persistent.sql.SqlSharkHelper.TABLE_ADDRESS)) + (net.sharkfw.knowledgeBase.persistent.sql.SqlSharkHelper.WHERE)) + (net.sharkfw.knowledgeBase.persistent.sql.SqlSharkHelper.FIELD_TAG_ID)) + (net.sharkfw.knowledgeBase.persistent.sql.SqlSharkHelper.EQ)) + (this.getSystemProperty("id"));
    try {
        net.sharkfw.knowledgeBase.persistent.sql.SqlHelper.executeSQLCommand(this.getConnection(), sql);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    addAddressesToDB(addresses);
}