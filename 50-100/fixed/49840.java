public static boolean userAllowedToOpenTreasure(int bid, int uid) throws java.sql.SQLException {
    java.sql.Connection conn = db.manager.DatabaseManager.getConnection();
    org.jooq.DSLContext create = org.jooq.impl.DSL.using(conn, SQLDialect.MYSQL);
    org.jooq.Record result = create.select(BOX.LAST_USERID).from(db.manager.BOX).where(BOX.BID.equal(bid)).fetchOne();
    conn.close();
    if ((result == null) || (result.getValue(BOX.LAST_USERID).equals(uid)))
        return false;
    else
        return true;
    
}