private static void printUsersWhoInteractedWith(java.lang.String user) {
    java.sql.ResultSet rs = main.Main.db.getResultSet(((((("SELECT DISTINCT author FROM Comment WHERE author IS NOT '" + user) + "' AND link_id IN") + " (SELECT DISTINCT link_id FROM Comment WHERE author = '") + user) + "' ORDER BY author)"));
    try {
        while (rs.next()) {
            java.lang.System.out.println(rs.getString(1));
        } 
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}