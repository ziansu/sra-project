@org.junit.Test
public void addGenreToFilm_ByGenreAndFilmId() {
    director = new am.aca.dao.impljdbc.DirectorDaoJdbc().addDirector("Matt Ross", false);
    film.setTitle("Captain Fantastic");
    film.addDirector(director);
    film.addGeners(Genre.DRAMA);
    filmDao.addFilm(film);
    assertTrue(filmDao.addGenreToFilm(film.getGeners().get(0), film.getId()));
}