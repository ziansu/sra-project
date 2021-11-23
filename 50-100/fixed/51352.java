public void resetDB() throws java.io.IOException, java.sql.SQLException {
    java.sql.Statement stmt = conn.createStatement();
    java.io.BufferedReader in = new java.io.BufferedReader(new java.io.FileReader("src/shared/DBWipe.sql"));
    java.lang.String str;
    while ((str = in.readLine()) != null) {
        stmt.execute(str);
    } 
    in.close();
    conn.close();
    stmt.close();
}