private java.sql.Connection createDb() throws java.sql.SQLException {
    java.sql.Connection conn = getConnection("indexhints");
    java.sql.Statement stat = conn.createStatement();
    stat.execute("create table test (x int, y int)");
    stat.execute("create index idx1 on test (x)");
    stat.execute("create index idx2 on test (x, y)");
    stat.execute("create index \"Idx3\" on test (y, x)");
    return conn;
}