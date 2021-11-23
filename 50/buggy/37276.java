public static java.sql.Timestamp toSqlTimestamp(java.sql.Timestamp ts) {
    java.sql.Timestamp res = new java.sql.Timestamp(ts.getSeconds());
    return res;
}