public java.sql.ResultSet getAllMovies() {
    java.lang.String sql = "SELECT * FROM Movies";
    result = constumQuery(sql);
    return result;
}