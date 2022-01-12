public cinema.Film getFilm(java.lang.String title) {
    java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> result = null;
    try {
        result = sqlManager.callStoredProcedure((("get_film_by_title(" + title) + ")"));
        java.util.Map<java.lang.String, java.lang.Object> filmMap = result.get(0);
        cinema.Film film = new cinema.Film(filmMap);
        return film;
    } catch (java.sql.SQLException e) {
        java.lang.System.err.println(e.getMessage());
    }
    return null;
}