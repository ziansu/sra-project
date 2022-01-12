private java.sql.ResultSet getRoomPhotosByStatus(java.sql.Connection connection, java.lang.String roomId, java.lang.String status) throws java.lang.Exception {
    com.uzapp.rest.admin.Photos.logger.info(((("GET photos for room " + roomId) + " and status ") + status));
    java.lang.String query = ((("SELECT name FROM photos where room_id='" + roomId) + "' and status='") + status) + "'";
    java.sql.PreparedStatement preparedStmt = connection.prepareStatement(query);
    com.uzapp.rest.admin.Photos.logger.info(("Query: " + query));
    java.sql.ResultSet rs = preparedStmt.executeQuery();
    preparedStmt.close();
    return rs;
}