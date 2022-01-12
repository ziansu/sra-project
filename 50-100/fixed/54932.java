public boolean fillCandidates(java.util.ArrayList<java.lang.String> candidates) {
    try {
        for (java.lang.String candidate : candidates) {
            sql = ((("INSERT INTO candidates(candidate_name, number_of_votes) VALUES ('" + candidate) + "','") + 0) + "')";
            stmt.executeUpdate(sql);
        }
        return true;
    } catch (java.sql.SQLException e) {
        return false;
    }
}