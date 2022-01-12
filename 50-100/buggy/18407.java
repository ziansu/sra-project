public void modify(java.sql.Connection conn, int id, java.lang.String content) throws java.sql.SQLException {
    java.sql.Statement s = conn.createStatement();
    int count;
    java.lang.String b = "\\";
    count = s.executeUpdate(((("UPDATE post SET content='" + content) + "', last_modified=CURRENT_TIMESTAMP WHERE post_id=") + id));
    s.close();
    java.lang.System.out.println((("[Server] {SQL}: " + count) + " rows where changed"));
}