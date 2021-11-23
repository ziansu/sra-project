public java.util.List<Tables.Movie> getRatedByAllInput(int rating) throws java.sql.SQLException {
    java.util.List<Tables.Movie> movies = new java.util.ArrayList<Tables.Movie>();
    java.lang.String query = (("select m.title, m.releasedate from movie m " + (("where not exists((select u1.accountname from users u1) " + "minus (select u2.accountname from users u2, review r ") + "where r.rating = ")) + rating) + " and u2.accountname = r.accountname and r.title = m.title and r.releasedate = m.releasedate))";
    java.sql.ResultSet results = getResult(query);
    while (results.next()) {
        movies.add(new Tables.Movie(results, this));
    } 
    return movies;
}