public static int editVenue(javax.servlet.http.HttpServletRequest request, java.sql.Connection connection) {
    java.sql.PreparedStatement ps = eTrams.utilities.databaseUtilities.SQLOperations.updateVenue(connection);
    try {
        ps.setString(1, request.getParameter("venue"));
        ps.setInt(2, java.lang.Integer.parseInt(request.getParameter("venueID")));
        if ((ps.executeUpdate()) > 0) {
            connection.commit();
            return 1;
        }
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return 0;
}