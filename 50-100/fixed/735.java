public cinema.Film getFilm(java.lang.String title) throws java.lang.ClassNotFoundException, java.sql.SQLException {
    java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> result = null;
    result = sqlManager.callStoredProcedure((("get_film_by_title(" + title) + ")"));
    java.util.Map<java.lang.String, java.lang.Object> filmMap = result.get(0);
    cinema.Film film = new cinema.Film(filmMap);
    return film;
}