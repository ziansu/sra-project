public boolean breakSectionCircuit(java.lang.String line, int block) throws java.sql.SQLException {
    java.sql.Statement stmt = conn.createStatement();
    boolean sucess = stmt.execute((((("UPDATE TTEDB.RailLines SET Status = '5', Status = '5' where Line = '" + line) + "' and BlockNumber = ") + block) + ";"));
    stmt.close();
    conn.close();
    return sucess;
}