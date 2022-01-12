public boolean fillCandidates(java.util.ArrayList<java.lang.String> candidates) {
    try {
        conn = java.sql.DriverManager.getConnection(Database.Database_2.DB_URL, Database.Database_2.USER, Database.Database_2.PASS);
        stmt = conn.createStatement();
        for (java.lang.String candidate : candidates) {
            sql = ((("INSERT INTO candidates(candidate_name, number_of_votes) VALUES ('" + candidate) + "','") + 0) + "')";
            stmt.executeUpdate(sql);
        }
        return true;
    } catch (java.sql.SQLException e) {
        return false;
    }
}