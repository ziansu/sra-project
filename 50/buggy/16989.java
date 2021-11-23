public java.sql.ResultSet getAllMovies() {
    java.lang.String sql = "SELECT * FROM Movies";
    java.sql.ResultSet resultSet = constumQuery(sql);
    try {
        java.lang.System.out.println(resultSet.getRow());
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return resultSet;
}